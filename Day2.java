import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] applicants = new int[n];
        int[] apartments = new int[m];

        for (int i = 0; i < n; i++) {
            applicants[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            apartments[i] = sc.nextInt();
        }

        Arrays.sort(applicants);
        Arrays.sort(apartments);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < n && j < m) {

            if (apartments[j] < applicants[i] - k) {
                // Apartment is too small
                j++;
            }
            else if (apartments[j] > applicants[i] + k) {
                // Apartment is too large
                i++;
            }
            else {
                // Valid match
                count++;
                i++;
                j++;
            }
        }

        System.out.println(count);
    }
}