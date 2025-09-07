import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
      //one of the correct ways is just by making all elements same
        while (t > 0) {
            int n;
            n = scanner.nextInt();
            for (int i = 0; i < n ; i ++){
                int x = scanner.nextInt();
                System.out.print(n - x + 1 + " ");
            }
            System.out.println();
            t --;
        }
    }
}
