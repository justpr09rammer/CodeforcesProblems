
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0){
            int n = scanner.nextInt();
            if (n % 3 == 1 || n % 3 == 2){
                System.out.println("First");
            }
            else System.out.println("Second");
            t --;
        }
    }
}




