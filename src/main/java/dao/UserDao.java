package dao;

import model.User;

public interface UserDao {

    User addUser (User user);
    User updateUser(User user);
    void delete(int idUser);

}
