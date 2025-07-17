import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0){

            int n, k;
            n = scanner.nextInt();
            k = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i ++){
                array[i] = scanner.nextInt();
            }
            int leftPointer = 0;
            int count = 0;
            int numberOfPeaks = 0;
            while (leftPointer < n){
                if (array[leftPointer] == 0){
                    count ++;
                }
                else count = 0;
                if (count != 0 && count % k == 0){
                    numberOfPeaks ++;
                    leftPointer ++;
                }
                leftPointer ++;
            }
            System.out.println(numberOfPeaks);

            t --;
        }


        scanner.close();
    }
}
