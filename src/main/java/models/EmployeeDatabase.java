package models;

import java.util.ArrayList;

public class EmployeeDatabase {
    private static ArrayList<Employee> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public boolean addNewEmployee(Employee employee) {
        if (isEmployeeAlreadyInList(employee.getFirstName(), employee.getLastName())) {
            System.out.println("Emloyee cannot be added. He is already in list.");
            return false;
        } else {
            employees.add(employee);
            System.out.println("Employee successfully added.");
            return true;
        }
    }

    public void printSumOfAllEmployeesSalaries() {
        Integer summarysalary = employees.stream().map(x -> x.getSalary()).reduce(0, Integer::sum);
        System.out.println("Sum of all employees salary is: " + summarysalary);
    }

    public void printAllEmployeesInformations() {
        for (Employee employee : employees) {
            employee.getAllEmployeeData();
        }
    }

    private boolean isEmployeeAlreadyInList(String firstName, String lastName) {
        return employees.stream().anyMatch(employee -> employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName));
    }
}
