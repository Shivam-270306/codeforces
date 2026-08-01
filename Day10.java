import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int remaining = 240 - k;
        int sum = 0;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            sum += 5 * i;
            if (sum <= remaining) {
                ans++;
            } else {
                break;
            }
        }

        System.out.println(ans);
    }
}