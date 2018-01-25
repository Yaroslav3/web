package servlet;

import dao.DaoFactory.ConnectionDatabase;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/authenticationServlet")
public class AuthenticationServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        System.out.println(email);
        System.out.println(password);

        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        try {
            if(connectionDatabase.authentication(email,password)){
               req.getRequestDispatcher("/error.jsp").forward(req,resp);
            }
            else if(!connectionDatabase.authentication(email,password)){
                req.getRequestDispatcher("authentication.jsp").forward(req,resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
