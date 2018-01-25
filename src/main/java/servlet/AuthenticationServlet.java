package servlet;

import dao.DaoFactory.ConnectionDatabase;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/authenticationServlet")
public class AuthenticationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        HttpSession session = req.getSession();

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        session.setAttribute("email", email);
        session.setAttribute("password", password);
        try {
            if (connectionDatabase.authentication(email, password)) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/error.jsp");
                dispatcher.forward(req, resp);
            } else if (!connectionDatabase.authentication(email, password)) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
                dispatcher.forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        User showUsers = null;
        try {
            showUsers = connectionDatabase.getShowUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assert showUsers != null;
        String name = showUsers.getName();
        String surname = showUsers.getSurname();
        String age = showUsers.getAge();
        String login = showUsers.getLogin();
        String emailSession = showUsers.getEmail();
        String role = showUsers.getRole();


        System.out.println(name + " " + age + " " + emailSession + " " + role);

        session.setAttribute("name", name);
        session.setAttribute("surname", surname);
        session.setAttribute("age", age);
        session.setAttribute("login", login);
        session.setAttribute("emailSession", emailSession);
        session.setAttribute("role", role);

    }
}
