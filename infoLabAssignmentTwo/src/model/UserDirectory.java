/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author danielike
 */
public class UserDirectory {
    ArrayList<User> allUsers;

    public UserDirectory() {
        this.allUsers = new ArrayList<>();
    }
    
    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
    
    public void addUser(User newUser){
        this.allUsers.add(newUser);
    }
    
    public void removeUser(User user){
        this.allUsers.remove(user);
    }

}
