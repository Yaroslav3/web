package service;

import model.User;

public interface UserService {

    User addUser (User user);
    User updateUser(User user);
    void delete(int idUser);

}
