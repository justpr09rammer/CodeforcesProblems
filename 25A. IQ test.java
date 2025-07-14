import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i ++){
            array[i] = scanner.nextInt();
        }
        boolean firstEven = false;
        boolean secondEven = false;
        boolean firstOdd = false;
        boolean secondOdd = false;
        int evenElementIndex = -1;
        int oddElementIndex = -1;

        for (int i = 0; i < array.length; i ++){
            if (array[i] % 2 == 0 && !firstEven){
                firstEven = true;
                evenElementIndex = i + 1;
            }
            else if (array[i] % 2 == 0 && firstEven){
                secondEven = true;
            }
            else if (array[i] % 2 != 0 && !firstOdd) {
                oddElementIndex = i + 1;
                firstOdd = true;
            }
            else if (array[i] % 2 != 0 && firstOdd){
                secondOdd = true;
            }
            if (firstOdd && firstEven && secondEven){
                System.out.println(oddElementIndex);
                return;
            }
            if (firstOdd && secondOdd && firstEven){
                System.out.println(evenElementIndex);
                return;
            }
        }
        System.out.println("invalid input");
    }

}
