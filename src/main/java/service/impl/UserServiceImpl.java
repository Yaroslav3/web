package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {


    @Override
    public User addUser(User user) {
        UserDao userDao = new UserDaoImpl();
        return userDao.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        UserDao userDao = new UserDaoImpl();
        return userDao.updateUser(user);
    }

    @Override
    public void delete(int idUser) {
        UserDao userDao = new UserDaoImpl();
        userDao.delete(idUser);
    }
}
