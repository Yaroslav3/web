package dao.impl;

import dao.DaoFactory.ConnectionDatabase;
import dao.UserDao;
import model.User;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    private static int userId;

    private final String INSERT_USER = "INSERT INTO online_store.user (name,surname," +
            "age,login,email,password,table_role) VALUE (?,?,?,?,?,?,?)";
    private final String AUTHENTICATION = "SELECT id, email, password FROM online_store.user";


    public boolean addUser(String name, String surname, int age, String login, String email, String password, String role) throws SQLException {

        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();
        PreparedStatement prepInsert = connect.prepareStatement(INSERT_USER);
        connect.setAutoCommit(false);
        prepInsert.setString(1, name);
        prepInsert.setString(2, surname);
        prepInsert.setInt(3, age);
        prepInsert.setString(4, login);
        prepInsert.setString(5, email);
        prepInsert.setString(6, password);
        prepInsert.setString(7, role);
        prepInsert.execute();
        connect.commit();
        prepInsert.close();
        connect.close();
        return false;
    }

    public boolean authentication(String email, String password) throws SQLException {

        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();
        Statement stat = connect.createStatement();
        ResultSet resultSet = stat.executeQuery(AUTHENTICATION);

        while (resultSet.next()) {
            connect.setAutoCommit(false);
            User user = new User();
            userId = resultSet.getInt("id");
            user.setEmail(resultSet.getString("email"));
            user.setPassword(resultSet.getString("password"));


            if (!email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return false;
            } else if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        connect.commit();
        resultSet.close();
        stat.close();
        return true;
    }

    public User getShowUsers() throws SQLException {

        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connect = connectionDatabase.getConnect();

        Statement stat = connect.createStatement();
        ResultSet resultSet = stat.executeQuery("SELECT id,name,surname,age,login,email,table_role FROM online_store.user");
        User user = new User();
        int idTable;
        while (resultSet.next()) {
            connect.setAutoCommit(false);
            user.setId(resultSet.getInt("id"));
            idTable = resultSet.getInt("id");
            if (userId == idTable) {
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setAge(String.valueOf(resultSet.getInt("age")));
                user.setLogin(resultSet.getString("login"));
                user.setEmail(resultSet.getString("email"));
                user.setRole(resultSet.getString("table_role"));
            }
        }
        connect.commit();
        connect.close();
        stat.close();
        return user;

    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        UserDaoImpl.userId = userId;
    }
}
