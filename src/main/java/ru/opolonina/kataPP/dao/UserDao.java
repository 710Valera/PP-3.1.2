package ru.opolonina.kataPP.dao;


import ru.opolonina.kataPP.model.User;

import java.util.List;


public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(int id);


    void updateUser(User user);

    void deleteUserById(int id);

}
