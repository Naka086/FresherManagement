package CRUD;

import Entity.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class UserManagementSystem {
    private List<User> users;

    // Constructor
    public UserManagementSystem() {
        this.users = new ArrayList<>();
    }


    public void addUser(User ump) {
        users.add(ump);
    }


    public void removeUser(int umpId) {
        users.removeIf(ump -> ump.getId() == umpId);
    }


    public void updateUser(int umpId, String newName, double newSalary) {
        for (User ump : users) {
            if (ump.getId() == umpId) {
                ump.setName(newName);
                ump.setSalary(newSalary);
                return;
            }
        }
        System.out.println("User with ID " + umpId + " not found.");
    }

    public void displayAllUsers() {
        System.out.println("List of User:");
        for (User ump : users) {
            System.out.println(ump);
        }
    }

    public void searchUserById(int umpId) {
        for (User ump : users) {
            if (ump.getId() == umpId) {
                System.out.println("User found: " + ump);
                return;
            }
        }
        System.out.println("User with ID " + umpId + " not found.");
    }
    JButton createButton = new JButton("Create");
    JButton readButton = new JButton("Read");
    JButton updateButton = new JButton("Update");
    JButton deleteButton = new JButton("Delete");
    JButton searchButton = new JButton("Search");
}

