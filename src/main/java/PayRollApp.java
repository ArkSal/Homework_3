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


//Program "Lista płac:"
//
//1. Stwórz klasę Models.Employee przechowującą imię, nazwisko oraz kwotę wypłaty pracownika. W zależności od dalszej części zadania dodaj odpowiedni konstruktor oraz gettery/settery.
// Stwórz również metodę getAllData(), która zwróci tekst w formacie „Salary for IMIE NAZWISKO is WYPLATA”

//2. W klasie Main i metodzie main() pobierz od użytkownika dane 5 pracowników (dla każdego imię, nazwisko i wysokość zarobków). Stwórz z nich obiekty klasy z pkt 1 i dodaj go do
// listy obiektów tej klasy (oczekiwane: ArrayList<Models.Employee>)

//3. Jeżeli podczas podawania kwoty użytkownik wprowadzi tekst zamiast liczby wypisz wiadomość: „You entered string, please enter integer value”.

//4. Powtarzaj całą czynność z punktów 2-4 tak długo aż użytkownik wprowadzi poprawną wartość.

//5. Po zakończeniu wprowadzania danych przez użytkownika, wyświetl menu programu zawierające 4 opcje:
//           1 – Print sum of all employees salary
//           2 – Display all employees data
//           3 – Add new employee
//           4 – End program
//7. Pobierz od użytkownika wartość liczbową w zależności jaki punkt menu chce uruchomić (użytkownik może wprowadzić liczby tylko od 1 do 4, wprowadzenie innej wartości powinny skutkować
// ponownym wyświetleniem menu i oczekiwaniem na wprowadzenie poprawnej wartości).
//8. Opcja 1 – wyświetl sumę zarobków wszystkich pracowników

//9. Opcja 2 - Wyświetl dane wszystkich pracowników (imiona, nazwiska, zarobki) korzystając z metody getAllData() (opisane w punkcie 1 zadania)

//10. Opcja 3 – użytkownik ma możliwość dodanie kolejnego pracownika do już istniejącej listy

//11. Opcja 4 – koniec działania programu.

//12. Obsłuż powyższe opcje używając instrukcji warunkowej switch

//12. Po wybraniu przez użytkownika poprawnego punktu menu, wykonaj wybrane przez użytkownika polecenie, a następnie wyświetl ponownie menu. Użytkownik może dowolnie wiele razy wykonywać poszczególne opcje programu. Działanie programu powinno się zakończyć dopiero kiedy użytkownik wybierze opcję 4.

//P.S. Jeżeli uznasz za stosowne stworzenie więcej klas niż samą klasę ‘Models.Employee’ aby rozwiązać to zadanie, to śmiało możesz tak zrobić.
