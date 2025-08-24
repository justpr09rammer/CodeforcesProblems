import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0){

            int n = scanner.nextInt();
            long[] array = new long[n];
            for (int i = 0; i < n; i ++){
                array[i] = scanner.nextLong();
            }
            long sum = 0L;
            Arrays.sort(array);
            for (int i = n - 1; i >= 0; i -= 2) {
                sum += array[i];
            }
            System.out.println(sum);
            t --;
        }


    }


}
