package strategy.drink;

public class IceTea implements Drink {
    @Override
    public void madeDrink() {
        System.out.println("아이스티 나왔습니다.");
    }
}
