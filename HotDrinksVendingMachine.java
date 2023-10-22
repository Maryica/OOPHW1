public class HotDrinksVendingMachine extends VendingMachine {

    public Product getProduct(String name, Double cost, Double volume, int temperature) {
        return new HotDrink(name, cost, volume, temperature);
    }

}