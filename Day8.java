
import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        while (n-- > 0) {
            String name = sc.next();

            if (!map.containsKey(name)) {
                System.out.println("OK");
                map.put(name, 1);
            } else {
                int count = map.get(name);
                String newName = name + count;

                System.out.println(newName);

                map.put(name, count + 1);
                map.put(newName, 1);
            }
        }
    }
}