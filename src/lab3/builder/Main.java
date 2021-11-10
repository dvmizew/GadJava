package lab3.builder;

public class Main {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder("Intel i9");
        builder.setBluetooth(true);
        builder.setMemory(200);
        builder.setRAM(3000);
        builder.setVideo("Nvidia");

        Computer myComputer = builder.build();

        System.out.println(myComputer);
    }
}
