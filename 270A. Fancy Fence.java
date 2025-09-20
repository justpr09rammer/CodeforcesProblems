//package Leetcode;
import java.lang.reflect.Array;
import java.util.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int angle = scanner.nextInt();
            if (360 % (180 - angle) == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
            t --;
        }
    }
}
