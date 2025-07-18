import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        while (n > 0){
            int[] array = new int[3];
            int count = 0;
            for (int i = 0; i < 3; i ++){
                array[i] = scanner.nextInt();
                if (array[i] == 1){
                    count ++;
                }
            }
            if (count >= 2){
                result ++;
            }

            n --;
        }
        System.out.println(result);

    }
}
