package com.company.services;

import com.company.forms.UserForm;
import com.company.models.User;

import java.util.List;

public interface SignUpService {
    void signUp(UserForm userForm);

    List<User> findAll();

    User findOne(Long userId);
}
