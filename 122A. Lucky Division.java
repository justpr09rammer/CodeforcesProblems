
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        int n = scanner.nextInt();
        int limit = 1000;
        dfs(0, limit, arr);
        Collections.sort(arr);
        for (int element : arr){
            if (element != 0 && n % element == 0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    private static void dfs(int n, int limit, List<Integer> arr){
        if (n >= limit){
            return;
        }
        arr.add(n);
        dfs(n * 10 + 4, limit, arr);
        dfs(n * 10 + 7, limit, arr);
    }
}
