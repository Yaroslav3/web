package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {


    @Override
    public boolean addUser(String name, String surname, int age, String login, String email,
                           String password, String role) throws SQLException {
        UserDao userDao = new UserDaoImpl();
        return userDao.addUser(name, surname, age, login, email, password, role);
    }

    @Override
    public User getShowUsers() {
        UserDao userDao = new UserDaoImpl();
        try {
            return userDao.getShowUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean authentication(String email, String password) {
        UserDao userDao = new UserDaoImpl();
        try {
            return userDao.authentication(email, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
