package lab2.ch3;

public class Fish extends Animal{
    protected Fish(int legs) {
        super(legs);
        this.legs = 0;
    }

    public Fish() {

    }

    @Override
    public void walk() {
        super.walk();
    }
}
