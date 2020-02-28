package strategy;

import strategy.drink.Coffee;

public class Main {
    public static void main(String[] args) {

        DrinkOrder drinkOrderCoffee = new DrinkOrder(new Coffee());
        drinkOrderCoffee.make();

        DrinkOrder drinkOrderWithoutMenu = new DrinkOrder();
        drinkOrderWithoutMenu.make();
    }
}
