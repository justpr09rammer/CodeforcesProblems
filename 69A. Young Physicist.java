import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = scanner.nextInt();
        int xSum = 0;
        int ySum = 0;
        int zSum = 0;

        while (n > 0){

            int[] array = new int[3];
            for (int i = 0; i < 3; i ++){
                array[i] = scanner.nextInt();
            }
            xSum += array[0];
            ySum += array[1];
            zSum += array[2];
            n --;
        }
        if (xSum == 0 && ySum == 0 && zSum == 0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

}
