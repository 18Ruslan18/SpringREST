package com.company.controlers;

import com.company.forms.LoginForm;
import com.company.forms.UserForm;
import com.company.models.Token;
import com.company.services.LoginService;
import com.company.transfer.TokenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody LoginForm loginForm){
       return ResponseEntity.ok(loginService.login(loginForm));
    }
}
