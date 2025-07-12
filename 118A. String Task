import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (!isVowel(ch)){
                sb.append('.');
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'A' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' || ch == 'e' || ch == 'E'|| ch == 'i' || ch == 'I'|| ch == 'y' || ch == 'Y';
    }
}
