package com.example.models;

import java.util.List;
public class Auth {
    public static boolean isValid(String username, String password) {
        List<User> userList = Storage.readContent();
        boolean valid = false;

        for(User user: userList) {
            if(user.getUser().equals(username) &&
                user.getPass().equals(password) &&
                user.getRole().equals("admin")
            ) {
                valid = true;
            }
        }

        return valid;
    }
}
