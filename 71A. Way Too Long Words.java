
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        scanner.nextLine();
        while (n > 0){
            String s = scanner.nextLine();
            function(s);
            n --;
        }
    }
    static void function(String s){
        if (s.length() > 10){
            System.out.print(s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1));
        }
        else {
            System.out.print(s);
        }
        System.out.println();
    }

}
