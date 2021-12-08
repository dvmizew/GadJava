package lab8.ex1;

public class Test {
    private int j;
    public int testLambda() {
        int i = 0;
        this.j++;
        Runnable r = () -> {
            System.out.println(i);
            System.out.println(this);
        };
        r.run();
        return i;
    }
    public static void main(String[] args) {
        //testLambda();
    }
}
