// Halloumi Boxes (Problem 1903A)

import java.util.*;

public class Main {
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);

    int test = sc.nextInt();

    while(test-->0){
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        if (k > 1){
            System.out.println("Yes");

        } else{
            
            for(int i = 1 ; i<n ; i++ ){
                if(arr[i] < arr[i-1]){
                    count++;
                }
            }
        

        if(count > 0){
            System.out.println("No");
            
        }else{
            System.out.println("Yes");
        }
    }
    }
    }
}
