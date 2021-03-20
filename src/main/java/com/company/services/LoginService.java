package com.company.services;

import com.company.forms.LoginForm;
import com.company.transfer.TokenDto;

public interface LoginService {
    TokenDto login(LoginForm loginForm);
}
