package lab2.ch3;

public class Spider extends Animal {
    public Spider(int legs) {
        super(legs);
        legs = 8;
    }

    @Override
    public void eat() {
        System.out.println("eating...");
    }
}