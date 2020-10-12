/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Ming
 */
public class AccountService {

    private ArrayList<User> users;

    public AccountService() {
        users = new ArrayList<>();
        users.add(new User("abe", "password"));
        users.add(new User("barb", "password"));
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                User goodUser = new User(username, null);
                return goodUser;
            }
        }
        return null;
    }

}
