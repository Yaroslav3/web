package servlet.bay;

import dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/buy")
public class BayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String bay = req.getParameter("bay");
        String id = req.getParameter("id");
        System.out.println(id);
        System.out.println(bay);

        int userId = UserDaoImpl.getUserId();


        if (userId == 0) {
            req.getRequestDispatcher("/authentication.jsp").forward(req, resp);
        }
        if (bay != null) {
            req.getRequestDispatcher("/basket.jsp").forward(req, resp);
        }
    }
}
