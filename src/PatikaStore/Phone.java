package PatikaStore;

import java.util.Scanner;

public class Phone extends Product {

    public Phone() {
        System.out.println();
    }

    Scanner scanner = new Scanner(System.in);


    @Override
    public void showMenu() {
        System.out.println("1 - List all phone\n" + "2 - Add new phone\n" + "3 - Delete phone\n"
                + "4 - Sort phone by id number\n" + "5 - Filter phone by brand" + "0 - Exit");
        System.out.print("Your choice: ");
        int select = scanner.nextInt();

        while (select < 0 || 5 < select) {
            System.out.println("Invalid number, try again.");
        }

        switch (select) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 0:

                break;

        }

    }

    @Override
    public void addProduct() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteProduct() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listProduct() {
        // TODO Auto-generated method stub

    }

}