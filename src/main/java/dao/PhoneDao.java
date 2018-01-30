package dao;

import model.Phone;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

public interface PhoneDao {

    boolean addPhone(String name, String color, int memory, int numberOfMegapixels, String photo) throws SQLException, FileNotFoundException;

    List<Phone> showPhone() throws SQLException;

    public List<Phone> showPhoneAll() throws SQLException;
    public void deletePhone(int id) throws SQLException;
}
