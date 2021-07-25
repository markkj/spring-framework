package com.jee;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean isUserValid(String username,String password){
        if(username.equals("mark") && password.equals("123456")){
            return true;
        }
        return false;
    }
}
