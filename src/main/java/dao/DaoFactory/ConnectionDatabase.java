package dao.DaoFactory;

import model.User;

import java.sql.*;

public class ConnectionDatabase {
    private final String URL = "jdbc:mysql://localhost:3306/online_store";
    private final String LOGIN = "root";
    private final String PASSWORD = "root";
    private final String INSERT_USER = "INSERT INTO online_store.user (name,surname," +
            "age,login,email,password,table_role) VALUE (?,?,?,?,?,?,?)";
    private final String AUTHENTICATION = "SELECT id, email, password FROM online_store.user";

    private static int id_entrance = 0;

    public Connection getConnect(String url, String login, String password) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            if (!connection.isClosed()) {
                System.out.println("connected");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("no connected");
        }

        return connection;
    }

    public boolean addUser(String name, String surname, int age, String login,
                           String email, String password, String role) throws SQLException {

        Connection connect = getConnect(URL, LOGIN, PASSWORD);
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
        Connection connect = getConnect(URL, LOGIN, PASSWORD);
        Statement stat = connect.createStatement();
        ResultSet resultSet = stat.executeQuery(AUTHENTICATION);

        while (resultSet.next()) {
            connect.setAutoCommit(false);
            User user = new User();
            id_entrance = resultSet.getInt("id");
            user.setEmail(resultSet.getString("email"));
            user.setPassword(resultSet.getString("password"));


            if (!email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return true;
            } else if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return false;
            }
        }
        connect.commit();
        resultSet.close();
        stat.close();
        return true;
    }

    public User getShowUsers() throws SQLException {
        Connection connect = getConnect(URL, LOGIN, PASSWORD);
        Statement stat = connect.createStatement();
        ResultSet resultSet = stat.executeQuery("SELECT id,name,surname,age,login,email,table_role FROM online_store.user");
        User user = new User();
        int id_table;
        while (resultSet.next()) {
            connect.setAutoCommit(false);
            user.setId(resultSet.getInt("id"));
            id_table = resultSet.getInt("id");
            if (id_entrance == id_table) {
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setAge(String.valueOf(resultSet.getInt("age")));
                user.setLogin(resultSet.getString("login"));
                user.setEmail(resultSet.getString("email"));
                user.setRole(resultSet.getString("table_role"));
            }
        }
        System.out.println(id_entrance + " id  ");
        connect.commit();
        connect.close();
        stat.close();
        return user;

    }
}

