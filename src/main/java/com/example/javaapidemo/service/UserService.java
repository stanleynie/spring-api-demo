package com.example.javaapidemo.service;

import com.example.javaapidemo.entity.User;

import java.util.Optional;

public interface UserService {
    public User addUser(User user);

    public Optional<User> getUserInfo(int id);

    public Iterable<User> getUserList();

    public User updateUser(User user);

    public String deleteUser(int id);
}
