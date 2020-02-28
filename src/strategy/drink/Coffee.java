package strategy.drink;

public class Coffee implements Drink {
    @Override
    public void madeDrink() {
        System.out.println("냉커피 나왔습니다.");
    }
}
