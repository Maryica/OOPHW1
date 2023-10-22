public class VendingMachine {
    public Product getProduct(String name) {
        return new Product(name);
    }

    public void productIssued(Product issu) {
        System.out.printf("Issued " + issu);
    }

}