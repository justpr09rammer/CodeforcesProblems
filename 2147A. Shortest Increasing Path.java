// package Leetcode;
import java.lang.reflect.Array;
import java.util.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x < y){
                System.out.println(2);
            }
            else if (y == 1){
                System.out.println(-1);
            }
            else{
                if (x - 1 > y){
                    System.out.println(3);
                }
                else System.out.println(-1);
            }
            t --;

        }
    }
}
