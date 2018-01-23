package dao.impl;

import dao.DaoFactory.ConnectionDatabase;
import dao.UserDao;
import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

public class UserDaoImpl implements UserDao {


    public User addUser(User user) {
        UserService userService = new UserServiceImpl();
        return userService.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        UserService userService = new UserServiceImpl();
        return userService.updateUser(user);
    }

    @Override
    public void delete(int idUser) {
        UserService userService = new UserServiceImpl();
        userService.delete(idUser);
    }
}
