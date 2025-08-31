
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        while (t > 0) {

            int n ,l;
            n = scanner.nextInt();
            l = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i ++){
                array[i] = scanner.nextInt();
            }

            if (n == 1){
                System.out.println(Math.max(array[0], l - array[0]));
                t --;
                continue;
            }
            Arrays.sort(array);
            double result = Integer.MIN_VALUE;
            for (int i = 0; i < n - 1; i ++){
                result = Math.max(result, (double) (array[i + 1] - array[i]) / 2.00);
            }
            if (array[0] != 0){
                result = Math.max(result, array[0]);
            }
            if (array[n - 1] != l){
                result = Math.max(result,l - array[n - 1]);
            }
            System.out.println(result);


            t--;
        }
    }
}
