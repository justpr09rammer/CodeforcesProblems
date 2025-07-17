
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int t = scanner.nextInt();
        while (t > 0){

            int n, j, k;
            n = scanner.nextInt();
            j = scanner.nextInt();
            k = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            int[] array = new int[n];
            for (int i = 0; i < n; i ++){
                array[i] = scanner.nextInt();
                if (array[i] > max){
                    max = array[i];
                }
            }
            if (k == 1){
                if (max == array[j - 1]){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }

            t --;
        }


        scanner.close();
    }
}
