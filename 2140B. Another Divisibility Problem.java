import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0){
            long x;
            x = scanner.nextLong();
            long temp = x;
            int digitSum = 0;
            int digitCount = 0;
            long firstDigit = temp;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            boolean flag = firstDigit == 9;
            while (temp > 0){
                digitSum += (int) (temp % 10);
                temp /= 10;
                digitCount ++;
            }
            if (flag) digitCount ++;
            long y = (long) (Math.pow(10, digitCount) - 1 - x);
            System.out.println(y);

            t --;
        }
    }
}
