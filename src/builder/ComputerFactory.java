package builder;

public class ComputerFactory {
    private final BluePrint bluePrint;

    public ComputerFactory(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public void make() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
    }

    public Computer getComputer() {
        return bluePrint.getComputer();
    }
}
