package PatikaStore;

import java.util.Scanner;

public class MainHelper {

    boolean isRun = true;

    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("PatikaStore Product Management Panel");
        System.out.println("1 - Notebook Transactions");
        System.out.println("2 - Phone Transactions");
        System.out.println("3 - List Brand");
        System.out.println("0 - Exit");
        System.out.print("\nYour choice: ");
        int select = scanner.nextInt();

        while (select < 0 || 3 < select) {
            System.out.println("Invalid number, try again!");
        }

        while (isRun) {
            switch (select) {
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.showMenu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.showMenu();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.showBrand();
                    break;
                case 0:
                    System.out.println("Good bye, see you again..");
                    isRun = false;
                    break;
            }

        }

    }

}