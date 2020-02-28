package builder;

public class NotebookBluePrint extends BluePrint {
    private Computer computer;

    public NotebookBluePrint() {
        this(new Computer("default", "default", "default"));
    }

    public NotebookBluePrint(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("16gb");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256gb ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
