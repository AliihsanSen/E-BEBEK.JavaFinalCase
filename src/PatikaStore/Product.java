package PatikaStore;

import java.util.Scanner;

public abstract class Product {

    protected String name;
    protected String color;
    protected int id;
    protected int discountRatio;
    protected int stock;
    protected int memory;
    protected int ram;
    protected double price;
    protected double screenSize;

    Brand brand;

    protected Scanner scanner = new Scanner(System.in);

    public Product() {
    }

    public Product(String name, String color, int id, int discountRatio, int stock, int memory, int ram, double price,
                   double screenSize, Brand brand, Scanner scanner) {

        this.name = name;
        this.color = color;
        this.id = id;
        this.discountRatio = discountRatio;
        this.stock = stock;
        this.memory = memory;
        this.ram = ram;
        this.price = price;
        this.screenSize = screenSize;
        this.brand = brand;
        this.scanner = scanner;
    }

    public abstract void showMenu();

    public abstract void addProduct();

    public abstract void deleteProduct();

    public abstract void listProduct();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(int discountRatio) {
        this.discountRatio = discountRatio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

}