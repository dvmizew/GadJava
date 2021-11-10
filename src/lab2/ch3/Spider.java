package lab2.ch3;

public class Spider extends Animal {
    public Spider(int legs) {
        super(8);
    }

    public Spider() {
        
    }

    @Override
    public void eat() {
        System.out.println("eating...");
    }
}