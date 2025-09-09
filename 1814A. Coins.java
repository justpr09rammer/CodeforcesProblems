
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            long n, k;
            n = scanner.nextLong();
            k = scanner.nextLong();
            if (n % 2 == 0){
                System.out.println("YES");
            }
            else {
                if (k % 2 == 0){
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
            t --;
        }
    }
}
