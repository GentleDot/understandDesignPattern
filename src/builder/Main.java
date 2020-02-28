package builder;

public class Main {
    public static void main(String[] args) {
        // 구현을 subClass에 넘겨주는 패턴
        ComputerFactory factory = new ComputerFactory(new NotebookBluePrint());
        factory.make();
        Computer myComputer = factory.getComputer();

        System.out.println(myComputer);

        // class 내 Builder class를 생성하는 패턴
        Computer anotherComputer = Computer.builder()
                .cpu("i7")
                .ram("32gb")
                .storage("1tb")
                .build();

        System.out.println(anotherComputer);
    }
}
