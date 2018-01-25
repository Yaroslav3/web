package dao.impl;

import dao.DaoFactory.ConnectionDatabase;
import dao.PhoneDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PhoneDaoImpl implements PhoneDao {
    private final String ADD_PHONE = "INSERT INTO product.phone ( name_model, color, displayResolution, diagonal, cpuName, processorFrequency, numberOfCores," +
            "ram, memory, numberOfMegapixels, " +
            "capacityOfTheBattery, weight, photo) " +
            "VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?)";


    @Override
    public boolean addPhone(String name, String color, double displayResolution,
                            String displayDiagonal, String cpuName, double processorFrequency,
                            byte numberOfCores, byte ram, short memory, byte numberOfMegapixels,
                            int capacityOfTheBattery, short weight, String photo) throws SQLException {


        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();
        PreparedStatement prepInsert = connect.prepareStatement(ADD_PHONE);
        connect.setAutoCommit(false);
        prepInsert.setString(1, name);
        prepInsert.setString(2, name);
        prepInsert.setString(3, color);
        prepInsert.setDouble(4, displayResolution);
        prepInsert.setString(5, displayDiagonal);
        prepInsert.setString(6, cpuName);
        prepInsert.setDouble(7, processorFrequency);
        prepInsert.setByte(8, numberOfCores);
        prepInsert.setByte(9, ram);
        prepInsert.setShort(10, memory);
        prepInsert.setByte(11, numberOfMegapixels);
        prepInsert.setInt(12, capacityOfTheBattery);
        prepInsert.setString(13, photo);

        prepInsert.execute();
        connect.commit();
        prepInsert.close();
        connect.close();
        return false;
    }
}
