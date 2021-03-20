package com.company.controlers;

import com.company.forms.UserForm;
import com.company.models.User;
import com.company.repositories.UsersRepository;
import com.company.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private SignUpService signUpService;
    @GetMapping("/users")
    public List<User> getUsers(){
        return signUpService.findAll();
    }
    @GetMapping("/users/{user-id}")
    public User getUser(@PathVariable("user-id") Long userId) {
        return signUpService.findOne(userId);
    }
    @PostMapping("/users")
    public ResponseEntity<Object> addUser (@RequestBody UserForm userForm){
        signUpService.signUp(userForm);
        return ResponseEntity.ok().build();
    }
}
