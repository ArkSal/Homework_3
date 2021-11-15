package handlers;

import models.EmployeeDatabase;

public class MenuHandler {
    private static EmployeeDatabase employeeDatabase = new EmployeeDatabase();

    public static final void startEmployeeDatabase() {
        System.out.println("Running PayRoll application." + "\nPlease add 5 new employees to pay roll.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee number " + (i + 1));
            while (!employeeDatabase.addNewEmployee(UserInputHandler.getEmployeeFromUser())) ;
        }
        System.out.println("Employees added successfully.");
    }

    public static final void printMenu() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("1 - to print sum of all employees salary\n" +
                "2 - to display all employees data\n" +
                "3 - to add new employee\n" +
                "4 - to shutdown");
        System.out.println("Choose your action:     ");
    }

    public static final void printSumOfAllEmployeesSalary(){
        employeeDatabase.printSumOfAllEmployeesSalaries();
        printMenu();
    }

    public static final void printAllEmployeesInfo(){
        employeeDatabase.printAllEmployeesInformations();
        printMenu();
    }

    public static final void addNewEmployee(){
        employeeDatabase.addNewEmployee(UserInputHandler.getEmployeeFromUser());
        printMenu();
    }
}
