import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int k, x;
            k = scanner.nextInt();
            x = scanner.nextInt();
            for (int i = 0; i < k; i ++){
                x *= 2;
            }
            System.out.println(x);
            t --;
        }
        
    }
}
