package strategy.drink;

public class Water implements Drink {
    @Override
    public void madeDrink() {
        System.out.println("냉수 나왔습니다.");
    }
}