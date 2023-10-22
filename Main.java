import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> HotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Black tea", 180.0, 0.23, 95),
                new HotDrink("Green tea", 180.0, 0.23, 85),
                new HotDrink("Americano", 180.0, 0.22, 85),
                new HotDrink("Espresso", 150.0, 0.04, 80),
                new HotDrink("Cappuccino", 200.0, 0.15, 55),
                new HotDrink("Latte", 200.0, 0.24, 65),
                new HotDrink("Cocoa", 180.0, 0.2, 75)));

        VendingMachine product = new HotDrinksVendingMachine();
        HotDrinksVendingMachine product1 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine product2 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine product3 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine product4 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine product5 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine product6 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine product7 = new HotDrinksVendingMachine();

        product.productIssued(product1.getProduct("Black tea", 180.0, 0.23, 95));
        product.productIssued(product2.getProduct("Green tea", 180.0, 0.23, 85));
        product.productIssued(product3.getProduct("Americano", 180.0, 0.22, 85));
        product.productIssued(product4.getProduct("Espresso", 150.0, 0.04, 80));
        product.productIssued(product5.getProduct("Cappuccino", 200.0, 0.15, 55));
        product.productIssued(product6.getProduct("Latte", 200.0, 0.24, 65));
        product.productIssued(product7.getProduct("Cocoa", 180.0, 0.2, 75));

    }

}