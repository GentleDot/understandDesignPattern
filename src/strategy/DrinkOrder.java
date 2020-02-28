package strategy;

import strategy.drink.Drink;
import strategy.drink.Water;

import java.util.Optional;

public class DrinkOrder {
    private final Drink drink;

    public DrinkOrder() {
        this(null);
    }

    public DrinkOrder(Drink drink) {
        this.drink = drink;
    }

    public void make() {
        Optional<Drink> getDrink = Optional.ofNullable(this.drink);
        getDrink.orElseGet(Water::new).madeDrink();
    }
}
