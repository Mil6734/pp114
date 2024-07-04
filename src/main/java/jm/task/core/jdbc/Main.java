package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Андрей", "Иванов", (byte) 22);
        userService.saveUser("Алексей", "Иванов", (byte) 23);
        userService.saveUser("Петя", "Иванов", (byte) 24);
        userService.saveUser("Антон", "Иванов", (byte) 25);
        userService.removeUserById(4);
        userService.cleanUsersTable();
        userService.dropUsersTable();
        System.out.println(userService.getAllUsers());
    }
}
