
import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(a + b + c,
                Math.max(a * b * c,
                        Math.max((a + b) * c,
                                Math.max(a * (b + c),
                                        Math.max(a + b * c,
                                                Math.max(a * b + c, b + a * c ))))));

        System.out.println(max);

    }


}
