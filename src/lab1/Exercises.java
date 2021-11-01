package lab1;

public class Exercises {
    public void arrays(){
        char[] copyFrom = {'d', 'e', 'c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom,2,9);

        System.out.println(new String(copyTo));
    }
}
