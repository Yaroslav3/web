package servlet.update;

import dao.PhoneDao;
import dao.impl.PhoneDaoImpl;
import model.Phone;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/getIdForUpdate")
public class GetIdUpdateServlet extends HttpServlet {
    private static int id;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        id = Integer.parseInt(req.getParameter("id"));

        String name_phone = null;
        String color = null;
        String memory = null;
        String megapixels = null;
        String photo = null;


        PhoneDao phoneDao = new PhoneDaoImpl();
        try {
            phoneDao.showPhoneId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PhoneDaoImpl phoneDao1 = new PhoneDaoImpl();
        List<Phone> list = null;
        try {
            list = phoneDao1.showPhoneAll();
            for (Phone elem : list) {
                int id1 = elem.getId();
                if (id == id1) {
                    name_phone = elem.getName();
                    color = elem.getColor();
                    memory = String.valueOf(elem.getMemory());
                    megapixels = String.valueOf(elem.getNumberOfMegapixels());
                    photo = elem.getPhoto();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        session.setAttribute("name_phone", name_phone);
        session.setAttribute("color", color);
        session.setAttribute("memory", memory);
        session.setAttribute("megapixels", megapixels);
        session.setAttribute("photo", photo);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/updatePhone.jsp");
        dispatcher.forward(req, resp);
    }

    public int getId() {
        return id;
    }
}
