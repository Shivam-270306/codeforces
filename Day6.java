import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            int needed = x - value;

            // Check if required value already exists
            if (map.containsKey(needed)) {
                System.out.println(map.get(needed) + " " + (i + 1));
                return;
            }

            // Store value with its 1-based position
            map.put(value, i + 1);
        }

        System.out.println("-1");
    }
}