package dao;

import model.User;

import java.sql.SQLException;

public interface UserDao {


    boolean addUser(String name, String surname, int age, String login,
                    String email, String password, String role) throws SQLException;

    public User getShowUsers() throws SQLException;

    public boolean authentication(String email, String password) throws SQLException;
}
