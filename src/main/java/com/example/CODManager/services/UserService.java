package com.example.CODManager.services;

import com.example.CODManager.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(Long userId);
    User createUser(User user);
    User updateUser(Long userId, User user);
    void deleteUser(Long userId);

}
