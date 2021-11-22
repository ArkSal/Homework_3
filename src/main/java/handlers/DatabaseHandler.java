package handlers;

import models.EmployeeDatabase;

public class DatabaseHandler {
    public static void fillEmployeeDatabase(EmployeeDatabase employeeDatabase) {
        System.out.println("Running PayRoll application." + "\nPlease add 5 new employees to pay roll.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee number " + (i + 1));
            employeeDatabase.addNewEmployee(UserInputHandler.getEmployeeFromUser(employeeDatabase));
        }
        System.out.println("Employees added successfully.");
    }
}
