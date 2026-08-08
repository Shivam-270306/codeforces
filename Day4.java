import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] events = new int[2 * n][2];

        int index = 0;

        for (int i = 0; i < n; i++) {
            int arrival = sc.nextInt();
            int leaving = sc.nextInt();

            // Arrival event
            events[index][0] = arrival;
            events[index][1] = 1;
            index++;

            // Leaving event
            events[index][0] = leaving;
            events[index][1] = -1;
            index++;
        }

        // Sort events by time
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int current = 0;
        int maximum = 0;

        for (int i = 0; i < 2 * n; i++) {

            current += events[i][1];

            maximum = Math.max(maximum, current);
        }

        System.out.println(maximum);
    }
}