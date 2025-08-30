
import java.util.*;
import java.util.Scanner;

public class Main {

    static long calculate(int x) {
        return (long) (Math.pow(3, x + 1) + x * Math.pow(3, x - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0) {
            /*
                if re given the case like this, i m storing the occurrences of each pow(3, x), then try to show it as 3 * pow(3, x - 1)
                now the question arises that, which pow(3,x) i need to write it as 3 * pow(3, x - 1)
                here is the illustration
                 3 ^ x           27      9      3     1
                 prices          108     33     10    3
                 occurrences     1       1      1     0
                 overall price in that case 108 + 33 + 10 = 151
                 so in the period of transition, my deals will increase by three, so I need to decrease the amount more, so
                 if I change 27 to 3 * 9, price ll be 33 * 4 + 10 = 142
                 so here if I change 3 to 3 * 1 -> the price ll be 108 +150,
                 and if I change 9 into 3 * 3 i ll get 108 + 4 * 10  = 148
                 as it can be noticed, in every transition the number of deals will increase by 2,
                 (imagine we re showing 9 by adding 3 times 3 and in this case the occurrence of 3 will increase by 3, and the occurrence of 9 will decrease by 1,
                 so overall deal increase will be 2)
                 so we need to minimize the price ,
                 so to do that the largest number should be transformed into its neighbor if currentDeals + 2 <= k
            */
            int n, k;
            n = scanner.nextInt();
            k = scanner.nextInt();

            int[] powerOccurrences = new int[60];
            int rightPointer = 0;
            int minDeals = 0;
            long price = 0;
            while (n > 0){
                int x = 0;
                int temp = 1;
                while (temp * 3 <= n){
                    temp *= 3;
                    x ++;
                }
                minDeals++;
                powerOccurrences[x] ++;
                rightPointer = Math.max(x, rightPointer);
                n -= temp;
                price += calculate(x);
            }
            if (minDeals > k){
                System.out.println(-1);
            }
            else if (minDeals + 2 > k){
                System.out.println(price);
            }
            else {
//                System.out.println(Arrays.toString(powerOccurrences));

                int leftPointer = rightPointer - 1;
                int dealDifference = k - minDeals;
//                System.out.println(price);
                while (dealDifference >= 2 && rightPointer >= 0 && leftPointer >= 0){
                    if (powerOccurrences[rightPointer] == 0){
                        rightPointer --;
                    }
                    else
                        if (dealDifference - powerOccurrences[rightPointer] * 2 >= 0){
                            powerOccurrences[leftPointer] += 3 * powerOccurrences[rightPointer];
                            price -= powerOccurrences[rightPointer] * calculate(rightPointer);
                            price += powerOccurrences[rightPointer] * 3 * calculate(leftPointer);
                            dealDifference -= powerOccurrences[rightPointer] * 2;
                            powerOccurrences[rightPointer] = 0;
                        }
                        else {
                            int temp = dealDifference / 2;
                            powerOccurrences[rightPointer] -= temp;
                            powerOccurrences[leftPointer] += temp * 3;
                            price -= temp * calculate(rightPointer);
                            price += 3 * temp * calculate(leftPointer);
                            dealDifference -= 2 * temp;
                        }


//                    System.out.println(price);
                    rightPointer --;
                    leftPointer --;
                }



                System.out.println(price);
            }





            t--;
        }
    }
}
