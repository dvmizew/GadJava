package lab3.builder;

public class Computer {
    private boolean bluetooth;
    private int RAM;
    private int memory;
    private String CPU;
    private String video;

    private Computer(String CPU, int RAM){
        this.CPU=CPU;
        this.RAM = RAM;
    }

    public String toString() {
        return "Computer with: " + CPU + ", ram " + RAM + ", video " + video;
    }

    public static class Builder {
        private boolean bluetooth;
        private int RAM;
        private int memory;
        private String CPU;
        private String video;

        public Builder(String CPU){
            this.CPU = CPU;
        }

        public void setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
        }

        public void setRAM(int RAM) {
            this.RAM = RAM;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public void setCPU(String CPU) {
            this.CPU = CPU;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Computer build() {
            Computer toReturn = new Computer(this.CPU, this.RAM);
            toReturn.bluetooth = this.bluetooth;
            toReturn.memory = this.memory;
            toReturn.video = this.video;

            return toReturn;
        }
    }
}
