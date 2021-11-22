package models;

import java.util.ArrayList;

public class EmployeeDatabase {
    private static ArrayList<Employee> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee successfully added.");
    }

    public void printSumOfAllEmployeesSalaries() {
        int sumOfSalaries = employees.stream().mapToInt(Employee::getSalary).sum();
        System.out.println("Sum of all employees salary is: " + sumOfSalaries);
    }

    public void printAllEmployeesInformations() {
        for (Employee employee : employees) {
            employee.getAllEmployeeData();
        }
    }

    public boolean hasEmployee(Employee employeeToAdd) {
        return employees
                .stream()
                .anyMatch(employee ->
                        employee.getFirstName().equals(employeeToAdd.getFirstName())
                                && employee.getLastName().equals(employeeToAdd.getLastName()));
    }
}
