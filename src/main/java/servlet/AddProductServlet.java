package servlet;

import dao.PhoneDao;
import dao.impl.PhoneDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.SQLException;


@WebServlet("/admin")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String nameModel = req.getParameter("nameModel");
        String color = req.getParameter("color");
       double displayResolution = Double.parseDouble(req.getParameter("displayResolution"));
        String diagonal = req.getParameter("diagonal");
        String cpuName = req.getParameter("cpuName");
       double processorFrequency = Double.parseDouble(req.getParameter("processorFrequency"));
        byte numberOfCores = Byte.parseByte(req.getParameter("numberOfCores"));
        byte ram = Byte.parseByte(req.getParameter("ram"));
        short memory = Short.parseShort(req.getParameter("memory"));
        byte numberOfMegapixels = Byte.parseByte(req.getParameter("numberOfMegapixels"));
        int capacityOfTheBattery = Integer.parseInt(req.getParameter("capacityOfTheBattery"));
        short weight = Short.parseShort(req.getParameter("weight"));
        String photo = req.getParameter("photo");
        Part filePart = req.getPart("file");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        InputStream fileContent = filePart.getInputStream();




        PhoneDao phoneDao = new PhoneDaoImpl();

        try {
            if(phoneDao.addPhone(nameModel,color,displayResolution,diagonal,cpuName,processorFrequency,numberOfCores,ram,memory,
                    numberOfMegapixels,capacityOfTheBattery,weight,photo));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
