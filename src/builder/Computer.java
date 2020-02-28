package builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    static class Builder {
        private String cpu;
        private String ram;
        private String storage;

        public Builder cpu(String spec) {
            this.cpu = spec;
            return this;
        }

        public Builder ram(String spec) {
            this.ram = spec;
            return this;
        }

        public Builder storage(String spec) {
            this.storage = spec;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    static Builder builder() {
        return new Builder();
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
