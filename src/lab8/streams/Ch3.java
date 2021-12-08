package lab8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ch3 {
    public static List<String> replace(List<String> words) {
        return words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> rez = replace(Arrays.asList("abc", "cder", "u", "1234"));
    }
}
