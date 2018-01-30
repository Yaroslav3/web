package servlet.upload;

import dao.PhoneDao;
import dao.impl.PhoneDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/admin")
public class UploadProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String nameModel = req.getParameter("nameModel");
        String color = req.getParameter("color");
        int memory = Integer.parseInt(req.getParameter("memory"));
        int numberOfMegapixels = Integer.parseInt(req.getParameter("megapixeles"));
        String photo = req.getParameter("photo");



        PhoneDao phoneDao = new PhoneDaoImpl();

        try {
            if (!phoneDao.addPhone(nameModel, color, memory, numberOfMegapixels, photo)) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
                dispatcher.forward(req, resp);
            } else if (phoneDao.addPhone(nameModel, color, memory, numberOfMegapixels, photo)) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/error");
                dispatcher.forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
