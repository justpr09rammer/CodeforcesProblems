import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int t = scanner.nextInt();
        while (t > 0){

            int x = scanner.nextInt();
            int min = Integer.MAX_VALUE;
            while (x > 0){
                min = Math.min(min, x % 10);
                x /= 10;
            }
            System.out.println(min);
            t --;
        }


        scanner.close();
    }
}
