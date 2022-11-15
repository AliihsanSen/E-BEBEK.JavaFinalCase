package PatikaStore;

import com.sun.source.tree.CaseTree;

import javax.swing.plaf.synth.SynthSliderUI;
import java.util.Scanner;

public class StoreMenu {
    Scanner scn = new Scanner(System.in);

    public void run(){
        while(true){
            System.out.println("Welcome to Patika Store");
            System.out.println("""
                    1 - Notebook
                    2 - Telephone
                    3 - Brand List
                    0 - Exit""");
            System.out.print("Please select a transection : ");
            int selection = scn.nextInt();

            String[] brands = {"Samsung","Lenovo","Apple","Huawei","Casper","Asus","HP","Xiaomi","Monster"};

            int index = 0;
            for (String brand:brands){
                Brand.addBrands(brand,index++);
            }

            boolean isExit= false;

            switch (selection) {
                case 0 -> isExit = true;
                case 1 -> {
                    System.out.println("You chose 1");
                    Product.proccesMenu(1);
                }
                case 2 -> {
                    System.out.println("You chose 2");
                    Product.proccesMenu(2);
                }
                case 3 -> Brand.printBrands();
                default -> {
                    System.out.println();
                    System.out.println("There is such an option please enter your choice again.");
                    System.out.println();
                }
            }
            if (isExit){
                System.out.println();
                System.out.println("You left the store. See you soon");
                return;
            }
        }

    }
}