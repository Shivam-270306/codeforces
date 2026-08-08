import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] weight = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        Arrays.sort(weight);

        int left = 0;
        int right = n - 1;
        int gondolas = 0;

        while (left <= right) {

            if (weight[left] + weight[right] <= x) {
                // Both children can go together
                left++;
                right--;
            } else {
                // Heaviest child must go alone
                right--;
            }

            gondolas++;
        }

        System.out.println(gondolas);
    }
}
