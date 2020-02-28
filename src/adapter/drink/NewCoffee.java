package adapter.drink;

public class NewCoffee {
    private String temperature;
    private float sugarCube;

    public NewCoffee(String temperature, float sugarCube) {
        this.temperature = temperature;
        this.sugarCube = sugarCube;
    }

    public String getTemperature() {
        return temperature;
    }

    public float getSugarCube() {
        return sugarCube;
    }

    @Override
    public String toString() {
        return "NewCoffee{" +
                "temperature='" + temperature + '\'' +
                ", sugarCube=" + sugarCube +
                '}';
    }
}
