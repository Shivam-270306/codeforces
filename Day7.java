//Codeforces Problem 339A

import java.util.*;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = s.split("\\+");

        Arrays.sort(arr);

        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print("+" + arr[i]);
        }
    }
}