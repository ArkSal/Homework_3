import handlers.DatabaseHandler;
import handlers.Menu;
import handlers.UserInputHandler;
import models.EmployeeDatabase;

public class PayRollApp {

    public static void main(String[] args) {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        DatabaseHandler.fillEmployeeDatabase(employeeDatabase);

        while (true) {
            Menu.print();
            System.out.println("\nEnter action: ");

            switch (UserInputHandler.getMenuOptionFromUser()) {
                case PRINTSUMOFSALARIES:
                    employeeDatabase.printSumOfAllEmployeesSalaries();
                    break;
                case PRINTALLEMPLOYEESDATA:
                    employeeDatabase.printAllEmployeesInformations();
                    break;

                case ADDNEWEMPLOYEE:
                    employeeDatabase.addNewEmployee(UserInputHandler.getEmployeeFromUser(employeeDatabase));
                    break;

                case QUIT:
                    System.out.println("\nQuiting...");
                    System.exit(1);
            }
        }
    }
}
