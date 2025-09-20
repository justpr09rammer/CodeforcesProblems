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
            int n = scanner.nextInt();
            int[] array = new int[2 * n];
            for (int i = 0; i < n; i++) {
                array[i] = n - i;
            }
            array[n] = n;
            for (int i = 1; i < n; i++) {
                array[n + i] = i;
            }
            for (int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
            t --;
        }
    }
}
