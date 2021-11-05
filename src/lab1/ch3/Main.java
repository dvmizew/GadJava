package lab1.ch3;
public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        int[] numbers = {1,1,0,-1,-1};
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 0)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
