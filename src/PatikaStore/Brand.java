package PatikaStore;
public class Brand {

    private String name;
    private int id;

    public void showBrand() {
        String[] brandList = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        for (String string : brandList) {
            System.out.println(string);
        }
    }

}