
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0){

            int n;
            n = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i ++){
                int input = scanner.nextInt();
                if (input == 0){
                    sum += 1;
                }
                else {
                    sum += input;
                }
            }
            System.out.println(sum);


            t --;
        }

    }
}

