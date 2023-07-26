package com.jwt.implementation.service;

import com.jwt.implementation.model.User;

public interface UserService {
    User readUser();

    User updateUser(User user);

    void deleteUser();

    User getLoggedInUser();
}
