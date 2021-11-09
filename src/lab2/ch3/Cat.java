package lab2.ch3;

public class Cat extends Animal implements Main.Pet {
    String name;
    protected Cat(int legs) {
        super(legs);
        legs = 4;
    }

    Cat(String name) {
        this.name = name;
    }
    Cat(){}

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {

    }
}