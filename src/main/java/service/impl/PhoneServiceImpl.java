package service.impl;

import dao.PhoneDao;
import dao.impl.PhoneDaoImpl;
import service.PhoneService;

import java.sql.SQLException;

public class PhoneServiceImpl implements PhoneService {


    public boolean addPhone(String name, String color, double displayResolution, String displayDiagonal, String cpuName,
                            double processorFrequency, byte numberOfCores, byte ram, short memory, byte numberOfMegapixels,
                            int capacityOfTheBattery, short weight, String photo) {
        PhoneDao phoneDao = new PhoneDaoImpl();
        try {
            return phoneDao.addPhone(name, color, displayResolution, displayDiagonal, cpuName,
                    processorFrequency, numberOfCores, ram, memory, numberOfMegapixels, capacityOfTheBattery, weight, photo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
