package models;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void getAllEmployeeData() {
        System.out.println("Salary for " + firstName + " " + lastName + " is " + salary);
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
