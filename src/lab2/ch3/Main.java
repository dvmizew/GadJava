package lab2.ch3;

public class Main {
    interface Pet {
        public String getName();
        public void setName(String name);
        public void play();
    }
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        //7. Experimenting :)
        d.walk();
        c.walk();
        a.walk();
        e.eat();
        System.out.println(e.legs);
        p.play();
        ((Spider) e).walk(); //casting objects

        Animal cristiSpider = new Spider();
        cristiSpider.walk();
    }
}