package handlers;

import models.Employee;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scanner = new Scanner(System.in);

    public static Employee getEmployeeFromUser() {
        System.out.println("Type first name:");
        String firstName = scanner.nextLine();
        System.out.println("Type last name:");
        String lastName = scanner.nextLine();
        System.out.println("Type salary:");
        int salary = getIntegerFromUser();
        scanner.nextLine();
        return new Employee(firstName, lastName, salary);
    }

    public static MenuSelectionHandler getMenuOptionFromUser() {
        return MenuSelectionHandler.values()[getSelectedOptionFromUser() - 1];
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();
        scanner.nextLine();
        if (result > 0 && result < MenuSelectionHandler.values().length + 1) {
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
