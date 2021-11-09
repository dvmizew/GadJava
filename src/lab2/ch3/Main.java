package lab2.ch3;

public class Main {
    interface Pet {
        public String getName();
        public void setName(String name);
        public void play();
    }
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat();
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
    }
}