package com.greenfoxacademy.weekproject.services;

import com.greenfoxacademy.weekproject.repositories.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
