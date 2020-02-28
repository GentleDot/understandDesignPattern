package adapter.drink;

public class Coffee {
    private String temperature;
    private int sugarCube;

    public Coffee(String temperature, int sugarCube) {
        this.temperature = temperature;
        this.sugarCube = sugarCube;
    }

    public String getTemperature() {
        return temperature;
    }

    public int getSugarCube() {
        return sugarCube;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "temperature='" + temperature + '\'' +
                ", sugarCube=" + sugarCube +
                '}';
    }
}
