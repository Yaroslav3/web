package service;

import model.Phone;

import java.sql.SQLException;
import java.util.List;

public interface PhoneService {
    boolean addPhone(String name, String color, int memory, int numberOfMegapixels, String photo);

    void deletePhone(int id);

    List<Phone> showPhoneId(int id);
}
