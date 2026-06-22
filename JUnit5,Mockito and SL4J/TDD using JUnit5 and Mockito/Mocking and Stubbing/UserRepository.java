package com.example;

import java.util.List;

public interface UserRepository {
    User findById(int id);
    List<User> findAll();
    User save(User user);
}