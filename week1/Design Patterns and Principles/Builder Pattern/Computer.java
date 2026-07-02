class Computer {

    private String cpu;
    private int ram;

    private Computer(Builder b){
        cpu = b.cpu;
        ram = b.ram;
    }

    static class Builder {
        String cpu;
        int ram;

        Builder setCPU(String cpu){
            this.cpu = cpu;
            return this;
        }

        Builder setRAM(int ram){
            this.ram = ram;
            return this;
        }

        Computer build(){
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM(16)
                .build();

        System.out.println("Computer built with CPU: " + computer.cpu + " and RAM: " + computer.ram + "GB");
    }
}