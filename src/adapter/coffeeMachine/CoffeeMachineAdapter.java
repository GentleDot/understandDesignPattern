package adapter.coffeeMachine;

import adapter.coffeeMaker.CoffeeMaker;
import adapter.drink.NewCoffee;

public class CoffeeMachineAdapter implements Adapter {
    private final CoffeeMaker coffeeMaker;

    public CoffeeMachineAdapter(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public NewCoffee getLowSugarCoffee(String temperature) {
        System.out.println("각설탕 반 개를 넣어 제작되었습니다.");
        return new NewCoffee(temperature, 0.5f);
    }

    @Override
    public NewCoffee getAmericano(String temperature) {
        return new NewCoffee(temperature, coffeeMaker.getzeroSugarCoffee().getSugarCube());
    }
}
