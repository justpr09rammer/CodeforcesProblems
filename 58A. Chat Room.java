import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String str = "hello";

        String s = scanner.nextLine();
        int leftPointerStr = 0;
        int leftPointerS = 0;
        while (leftPointerS < s.length()){
            if (str.charAt(leftPointerStr) == s.charAt(leftPointerS)){
                leftPointerStr ++;
            }
            if (leftPointerStr == 5){
                System.out.println("YES");
                return;
            }
            leftPointerS ++;
        }
        System.out.println("NO");
    }

}
