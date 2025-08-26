import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0){

            int n, a, b;
            n = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();

            //if n is even

            if (n % 2 == 0){
                if (a % 2 != 0 && b % 2 !=0){
                    System.out.println("NO");
                }
                else if (a % 2 == 0 && b % 2 == 0){
                    System.out.println("YES");
                }
                else if (b >= a && b % 2 == 0){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                if (a % 2 == 0 && b % 2 == 0){
                    System.out.println("NO");
                }
                else if (b >= a){
                    if (b % 2 != 0){
                        System.out.println("YES");
                    }
                    else System.out.println("NO");
                }
                else {
                    if (a % 2 != 0 && b % 2 != 0){
                        System.out.println("YES");
                    }
                    else if (a % 2 != 0 && b % 2 == 0){
                        System.out.println("NO");
                    }
                    else if (a % 2 == 0){
                        System.out.println("NO");
                    }
                    else System.out.println("YES");
                }
            }
            t --;
        }


    }


}
