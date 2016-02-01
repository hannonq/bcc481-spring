package com.bcc481.services;

import com.bcc481.models.User;
import com.bcc481.models.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by hannon on 01/02/16.
 */
public interface UserService {
    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);
}
