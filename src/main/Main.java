package main;

import CRUD.UserManagementSystem;
import Login.IDandPasswords;
import Login.LoginPage;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        new LoginPage(idandPasswords.getLoginInfo());
        UserManagementSystem umpSystem = new UserManagementSystem();

        umpSystem.displayAllUsers();

        umpSystem.displayAllUsers();

        umpSystem.searchUserById(2);

        umpSystem.removeUser(1);

        umpSystem.displayAllUsers();
    }
}
