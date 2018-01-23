package servlet;

import dao.DaoFactory.ConnectionDatabase;
import security.UserWebSecurity;
import security.impl.UserWebSecurityImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registrationUser")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        int age = Integer.parseInt(req.getParameter("age"));
        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        System.out.println(name);
        System.out.println(age);

        UserWebSecurity userWebSecurity = new UserWebSecurityImpl();
        String bCrypt = userWebSecurity.createBCrypt(password);
        System.out.println(bCrypt);

        ConnectionDatabase database = new ConnectionDatabase();
        try {
            if (!database.addUser(name, surname, age, email, login, bCrypt)) {
                req.getRequestDispatcher("/registrationSuccessful.jsp").forward(req, resp);
            } else if (database.addUser(name, surname, age, email, login, bCrypt)) {
                req.getRequestDispatcher("/error.jsp").forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
