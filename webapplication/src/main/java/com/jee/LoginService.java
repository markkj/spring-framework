package com.jee;

public class LoginService {

    public boolean isUserValid(String username,String password){
        if(username.equals("mark") && password.equals("123456")){
            return true;
        }
        return false;
    }
}