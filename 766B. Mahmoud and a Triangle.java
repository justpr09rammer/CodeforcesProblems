//package Leetcode;
import java.lang.reflect.Array;
import java.util.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;

//        while (t > 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i ++){
                array[i] = scanner.nextInt();
            }
            boolean flag = false;
            Arrays.sort(array);
            for (int i = 0; i <= n - 3; i ++){
                if (array[i] + array[i + 1] > array[i + 2]){
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println("NO");
            }

        }
//    }
}
