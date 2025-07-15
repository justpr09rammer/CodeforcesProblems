
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int[] dpMinLeft = new int[n];
            dpMinLeft[0] = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                dpMinLeft[i] = Math.min(dpMinLeft[i - 1], array[i - 1]);
            }
            int[] dpMaxRight = new int[n];
            dpMaxRight[n - 1] = Integer.MIN_VALUE;
            for (int i = n - 2; i >= 0; i--) {
                dpMaxRight[i] = Math.max(dpMaxRight[i + 1], array[i + 1]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int target = array[i];

                if (target <= dpMinLeft[i] || target >= dpMaxRight[i]) {
                    sb.append('1');
                } 
                else {
                    sb.append('0');
                }
            }

            System.out.println(sb);
        }

        scanner.close();
    }
}
