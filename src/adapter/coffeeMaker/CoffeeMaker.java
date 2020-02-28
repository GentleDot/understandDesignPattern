package adapter.coffeeMaker;

import adapter.drink.Coffee;

public class CoffeeMaker {
    public Coffee getTodaysCoffee() {
        return new Coffee("hot", 2);
    }

    public Coffee getzeroSugarCoffee() {
        return new Coffee("hot", 0);
    }
}
