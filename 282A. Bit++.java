import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 

        int result = 0;
        while(n > 0){
            String s = scanner.nextLine();
            if (s.charAt(1) == '+'){
                result++;
            } else {
                result--;
            }
            n--;
        }
         System.out.println(result);

    }
}
