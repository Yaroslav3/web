package service.impl;

import dao.PhoneDao;
import dao.impl.PhoneDaoImpl;
import model.Phone;
import service.PhoneService;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

public class PhoneServiceImpl implements PhoneService {

    public boolean addPhone(String name, String color, int memory, int numberOfMegapixels, String photo) {
        PhoneDao phoneDao = new PhoneDaoImpl();
        try {
            return phoneDao.addPhone(name, color, memory, numberOfMegapixels, photo);
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void deletePhone(int id) {
        PhoneDao phoneDao = new PhoneDaoImpl();
        try {
            phoneDao.deletePhone(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Phone> showPhoneId(int id) {
        PhoneDao phoneDao = new PhoneDaoImpl();
        try {
            return phoneDao.showPhoneId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
