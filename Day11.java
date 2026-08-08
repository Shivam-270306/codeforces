import java.util.*;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long currentSum = 0;
        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            long value = sc.nextLong();

            currentSum = Math.max(value, currentSum + value);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}