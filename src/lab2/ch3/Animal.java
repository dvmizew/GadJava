package lab2.ch3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    protected Animal() {
    }

    public abstract void eat();
    public void walk() {
        System.out.print("The animal walks " + legs);
    }
}