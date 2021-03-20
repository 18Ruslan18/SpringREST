package com.company.controlers;

import com.company.models.User;
import com.company.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;
    @GetMapping("/users")
    public List<User> getUsers(){
        return usersRepository.findAll();
    }
}
