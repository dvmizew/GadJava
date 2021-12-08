package lab8.ch1;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.function.Consumer;

public class Consumer1 {
    @Test
    public void consumer_1() {
        List<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));

        //Consumer<List<String>> consumer = (List<String> 1) -> l.clear();
        //consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>());
        System.out.println("---");
        }

    /*@Test
    public class consumer_2() {
    List<String> list1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
    List<String> list2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "first", "second"));

    Consumer<List<String>> c1 = list -> list.add("first");
    Consumer<List<String>> c2 = list -> list.add("second");

    Consumer<List<String>> consumer = c1.andThen(c2);
    Consumer<List<String>> consumer1 = list -> list.add("first");

    //Assert.assertEquals(list1, list2);
    }*/
}

