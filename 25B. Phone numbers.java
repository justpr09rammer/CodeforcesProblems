
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        int n = scanner.nextInt();
 
 
        scanner.nextLine();
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int y = n / 3;
        int remainder = n % 3;
        int x = 0;
        if (remainder == 2){
            x += 1;
        }
        else if (remainder == 1){
            x += 2;
            y -=1;
        }
 
        int i = 0;
 
        while (i < 3 * y){
            sb.append(s, i, i + 3);
            sb.append("-");
            i += 3;
        }
 
        while (i < n){
            sb.append(s, i, i + 2);
            sb.append("-");
            i += 2;
        }
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb.toString());
    }
 
}
