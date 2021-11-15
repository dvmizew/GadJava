package lab3.visitor;

public class Video implements Element {
    private String name;
    private String type;
    private int price;
    private int time;

    public Video(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }
    public void accept(Visitor v){
        v.visit(this);
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + " , price" + price + " ,time " + time;
    }
}