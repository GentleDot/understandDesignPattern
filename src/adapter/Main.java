package adapter;

import adapter.coffeeMachine.Adapter;
import adapter.coffeeMachine.CoffeeMachineAdapter;
import adapter.coffeeMaker.CoffeeMaker;

public class Main {
    public static void main(String[] args) {
        Adapter coffeeMachineAdapter = new CoffeeMachineAdapter(new CoffeeMaker());

        System.out.println(coffeeMachineAdapter.getAmericano("hot"));
        System.out.println(coffeeMachineAdapter.getLowSugarCoffee("cold"));
    }
}
