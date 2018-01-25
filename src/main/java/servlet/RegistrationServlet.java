package servlet;

import dao.DaoFactory.ConnectionDatabase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registrationUser")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        int age = Integer.parseInt(req.getParameter("age"));
        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        session.setAttribute("name", name);
        session.setAttribute("surname", surname);
        session.setAttribute("age", age);
        session.setAttribute("login", login);
        session.setAttribute("email", email);
        session.setAttribute("password", password);
        session.setAttribute("role", role);

        String roles = null;
        if (role == null) {
            roles = "user";
        } else if (role.equals("on")) {
            roles = "admin";
        }

        System.out.println(age);
        System.out.println(role);
        System.out.println(roles);

//        UserWebSecurity userWebSecurity = new UserWebSecurityImpl();
//        String bCrypt = userWebSecurity.createBCrypt(password);
//        System.out.println(bCrypt);

        ConnectionDatabase database = new ConnectionDatabase();

        try {
            if (!database.addUser(name, surname, age, login, email, password, roles)) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/registrationSuccessful.jsp");
                dispatcher.forward(req, resp);
            } else if (database.addUser(name, surname, age, login, email, password, roles)) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/error.jsp");
                dispatcher.forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
