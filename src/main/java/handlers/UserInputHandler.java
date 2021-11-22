package handlers;

import models.Employee;
import models.EmployeeDatabase;
import models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scanner = new Scanner(System.in);

    public static Employee getEmployeeFromUser(EmployeeDatabase employeeDatabase) {
        System.out.println("Type first name:");
        String firstName = scanner.nextLine();
        System.out.println("Type last name:");
        String lastName = scanner.nextLine();
        System.out.println("Type salary:");
        int salary = getIntegerFromUser();
        scanner.nextLine();
        Employee employee = new Employee(firstName, lastName, salary);

        if (employeeDatabase.hasEmployee(employee)) {
            System.out.println("You enter user that is already in database, try again");
            return getEmployeeFromUser(employeeDatabase);
        }
        return employee;
    }

    public static MenuOptions getMenuOptionFromUser() {
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();
        scanner.nextLine();
        if (result > 0 && result < MenuOptions.values().length + 1) {
            return result;
        } else {
            System.out.println("You selected non exiting option: " + result);
            System.out.println("Please try again");
            return getSelectedOptionFromUser();
        }
    }

    private static int getIntegerFromUser() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("It's not an integer number, try one more:");
        }
        return scanner.nextInt();
    }


}
