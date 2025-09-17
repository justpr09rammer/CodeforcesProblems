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
            int n, k;
            n = scanner.nextInt();
            k = scanner.nextInt();
            int[] prices = new int[n];
            int[] vouchers = new int[k];

            for (int i = 0; i < n; i ++){
                prices[i] = scanner.nextInt();
            }
            for (int i = 0; i < k; i ++){
                vouchers[i] = scanner.nextInt();
            }
            Arrays.sort(prices);
            Arrays.sort(vouchers);
            int rightPointerPrice = n - 1;
            int leftPointerVoucher = 0;
            long price = 0;
            while (leftPointerVoucher < k && rightPointerPrice >= 0){

                if (vouchers[leftPointerVoucher] == 1){
                    price += 0;
                    rightPointerPrice --;
                    vouchers[leftPointerVoucher] --;
                }
                else {
                    while (vouchers[leftPointerVoucher] > 0 && rightPointerPrice >= 0){
                        if (vouchers[leftPointerVoucher] == 1){
                            price += 0;
                        }
                        else {
                            price +=(long) prices[rightPointerPrice];
                        }
                        rightPointerPrice --;
                        vouchers[leftPointerVoucher] --;
                    }
                }
                leftPointerVoucher ++;
            }
            while (rightPointerPrice >= 0){
                price += prices[rightPointerPrice];
                rightPointerPrice --;
            }
            System.out.println(price);
            t --;
        }

        scanner.close();
    }
}
