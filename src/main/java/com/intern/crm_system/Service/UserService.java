package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUserById(Long id);
    User createUser(User user);
}
