import java.util.Scanner;

public class Main {

    static long calculate(int x) {
        return (long) (Math.pow(3, x + 1) + x * Math.pow(3, x - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            long totalPrice = 0;
            long n = scanner.nextLong();
            while (n > 0) {

                int x = 0;
                int temp = 1;
                while (temp * 3 <= n){
                    temp *= 3;
                    x ++;
                }
                long price = calculate(x);
                totalPrice += price;
                n -=  Math.pow(3, x);
            }
            System.out.println(totalPrice);
            t--;
        }
    }
}
