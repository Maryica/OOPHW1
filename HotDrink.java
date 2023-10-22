public class HotDrink extends Product {
    private int temperature;
    private Double volume;
    private String name;

    public HotDrink(String name, Double cost, Double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
        this.name = name;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Наименование\t" + name + ", Объём\t" + volume + ", температура\t" + temperature;
    }
}