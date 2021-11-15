import handlers.MenuHandler;
import handlers.UserInputHandler;

public class PayRollApp {
    public static void main(String[] args) {

        boolean quit = false;
        MenuHandler.startEmployeeDatabase();
        MenuHandler.printMenu();
        while (!quit) {
            System.out.println("\nEnter action: ");

            switch (UserInputHandler.getMenuOptionFromUser()) {
                case PRINTSUMOFSALARIES:
                    MenuHandler.printSumOfAllEmployeesSalary();
                    break;

                case PRINTALLEMPLOYEESDATA:
                    MenuHandler.printAllEmployeesInfo();
                    break;

                case ADDNEWEMPLOYEE:
                    MenuHandler.addNewEmployee();
                    break;

                case QUIT:
                    System.out.println("\nQuiting...");
                    System.exit(1);
            }
        }
    }
}
