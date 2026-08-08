import java.util.*;

public class Day5 {
    public static void Day5(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] movies = new int[n][2];

        for (int i = 0; i < n; i++) {
            movies[i][0] = sc.nextInt(); // start
            movies[i][1] = sc.nextInt(); // end
        }

        // Sort by ending time
        Arrays.sort(movies, (a, b) -> a[1] - b[1]);

        int lastEnd = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            int start = movies[i][0];
            int end = movies[i][1];

            if (start >= lastEnd) {
                count++;
                lastEnd = end;
            }
        }

        System.out.println(count);
    }
}
