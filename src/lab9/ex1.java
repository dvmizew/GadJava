package lab9;

import java.util.stream.IntStream;

public class ex1 {
    public static void main(String[] args) {
        int factor = 2;
        IntStream s = IntStream.range(0, 1000).map(e ->{ System.out.println(e);
        return e * factor;});
        int first = s.sum();
        System.out.println(first);
    }
}
