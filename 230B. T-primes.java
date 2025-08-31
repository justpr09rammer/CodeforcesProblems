
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean[] isPrime = new boolean[1000001];

    static void sieve() {
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        sieve();

        while (t > 0) {
            Long x = scanner.nextLong();
            if (x == 1){
                System.out.println("NO");
            }
            else {
                if (Math.sqrt(x) == (int) Math.sqrt(x) && isPrime[(int)Math.sqrt(x)]){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            t--;
        }
    }
}
