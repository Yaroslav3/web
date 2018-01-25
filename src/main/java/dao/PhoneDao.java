package dao;

import java.sql.SQLException;

public interface PhoneDao {

    boolean addPhone(String name, String color, double displayResolution,String displayDiagonal, String cpuName,
                     double processorFrequency, byte numberOfCores, byte ram,short memory, byte numberOfMegapixels,
                     int capacityOfTheBattery, short weight, String photo) throws SQLException;
}
