public class Product {
    private String name;
    private Double cost;

    public Product(String name, Double cost, Double volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double volume;

    @Override
    public String toString() {
        return "Наименование\t " + name +
                ", Цена\t " + cost +
                ", Объём\t " + volume;
    }
}