package adapter.coffeeMachine;

import adapter.drink.NewCoffee;

public interface Adapter {
    NewCoffee getLowSugarCoffee(String temperature);
    NewCoffee getAmericano(String temperature);
}
