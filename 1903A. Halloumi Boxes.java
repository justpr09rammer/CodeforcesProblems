
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0){

            boolean isAlreadySortedIncreasing = true;
            int n, k;
            n = scanner.nextInt();
            k = scanner.nextInt();
            int before = Integer.MIN_VALUE;
            for (int i = 0; i < n; i ++){
                int current = scanner.nextInt();
                if (current < before ){
                    isAlreadySortedIncreasing = false;
                }
                before = current;
            }
            if (isAlreadySortedIncreasing){
                System.out.println("YES");
            }
            else {
                if (k == 1) {
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
            t --;
        }
    }
}
