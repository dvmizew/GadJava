package lab1.ch4;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        int[] numbers = {1,-1,-1,2};
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = i + 2; k <numbers.length; k++){
                if (numbers[i] + numbers[j] + numbers[k] == 0)
                    cnt++;
                }
            }
        }
        System.out.println(cnt); //print statement
    }
}