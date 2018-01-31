package dao.impl;

import dao.DaoFactory.ConnectionDatabase;
import dao.PhoneDao;
import model.Phone;

import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhoneDaoImpl implements PhoneDao {
    private List<Phone> phoneList = new ArrayList<>();
    private static int idProduct;
    private static int idUpdate;
    private final String ADD_PHONE = "INSERT INTO product.phone (name_phone, color, memory, megapixels, photo)" +
            "" + "VALUE (?,?,?,?,?)";
    private final String DELETE_PHONE = "DELETE FROM product.phone WHERE id = ?";
    private final String UPDATE_PHONE = "UPDATE product.phone SET name_phone=?,color=?,memory=?,megapixels=?,photo=? WHERE id = ?";


    @Override
    public boolean addPhone(String name, String color, int memory,
                            int numberOfMegapixels, String photo) throws SQLException, FileNotFoundException {

        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();
        PreparedStatement prepInsert = connect.prepareStatement(ADD_PHONE);
        connect.setAutoCommit(false);
        prepInsert.setString(1, name);
        prepInsert.setString(2, color);
        prepInsert.setInt(3, memory);
        prepInsert.setInt(4, numberOfMegapixels);
        prepInsert.setString(5, photo);
        prepInsert.execute();
        connect.commit();
        prepInsert.close();
        connect.close();
        return false;
    }

    public List<Phone> showPhone() throws SQLException {
        List<Phone> list = new LinkedList<>();
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM product.phone");

        while (resultSet.next()) {
            Phone phone = new Phone();
            connect.setAutoCommit(false);
            phone.setId(resultSet.getInt("id"));

            if (idProduct == resultSet.getInt("id")) {

                phone.setName(resultSet.getString("name_model"));
                phone.setColor(resultSet.getString("color"));
                phone.setMemory(resultSet.getInt("memory"));
                phone.setNumberOfMegapixels(resultSet.getInt("numberOfMegapixels"));
                phone.setPhoto(resultSet.getString("photo"));
                list.add(phone);
                connect.commit();
                resultSet.close();
                connect.close();
                return list;
            }
        }
        return null;
    }

    public List<Phone> showPhoneAll() throws SQLException {

        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM product.phone");

//        if(phoneList == null){
//            connect.close();
//        }

        while (resultSet.next()) {
            Phone phone = new Phone();
            connect.setAutoCommit(false);
            phone.setId(resultSet.getInt("id"));
            phone.setName(resultSet.getString("name_phone"));
            phone.setColor(resultSet.getString("color"));
            phone.setMemory(resultSet.getInt("memory"));
            phone.setNumberOfMegapixels(resultSet.getInt("megapixels"));
            phone.setPhoto(resultSet.getString("photo"));
            phoneList.add(phone);
        }
        connect.commit();
        resultSet.close();
        connect.close();
        return phoneList;
    }


    public boolean deletePhone(int id) throws SQLException {
        ConnectionDatabase connection = new ConnectionDatabase();
        Connection connect = connection.getConnect();
        connect.setAutoCommit(false);
        PreparedStatement statementDelete = connect.prepareStatement(DELETE_PHONE);
        statementDelete.setInt(1, id);
        statementDelete.executeUpdate();
        connect.commit();
        connect.close();
        return true;
    }

    public boolean updatePhone(int id, String name, String color, int memory,
                               int numberOfMegapixels, String photo) throws SQLException {
        ConnectionDatabase connection = new ConnectionDatabase();
        Connection connect = connection.getConnect();
        connect.setAutoCommit(false);
        PreparedStatement statementUpdate = connect.prepareStatement(UPDATE_PHONE);
        statementUpdate.setString(1, name);
        statementUpdate.setString(2, color);
        statementUpdate.setInt(3, memory);
        statementUpdate.setInt(4, numberOfMegapixels);
        statementUpdate.setString(5, photo);
        statementUpdate.setInt(6,id);

        statementUpdate.executeUpdate();
        connect.commit();
        statementUpdate.close();
        connect.close();
        return true;
    }

    public List<Phone> showPhoneId(int id) throws SQLException {
        System.out.println(id);
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM product.phone");
        List<Phone> phoneShow = new ArrayList<>();
        phoneShow.clear();

        while (resultSet.next()) {
            int id1 = resultSet.getInt("id");
            idUpdate = id;
            if (id == id1) {
                Phone phone = new Phone();
                connect.setAutoCommit(false);
                phone.setName(resultSet.getString("name_phone"));
                phone.setColor(resultSet.getString("color"));
                phone.setMemory(resultSet.getInt("memory"));
                phone.setNumberOfMegapixels(resultSet.getInt("megapixels"));
                phone.setPhoto(resultSet.getString("photo"));
                phoneShow.add(phone);
            }
        }
        connect.commit();
        resultSet.close();
        connect.close();
        return phoneShow;
    }
}

