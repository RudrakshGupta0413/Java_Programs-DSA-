import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];

        // array of primitives
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 67;
        // arr[3] = 89;
        // arr[4] = 12;
        
        // System.out.println(arr[3]);

        // //input usin67g for loop 
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // // for (int i = 0; i < arr.length; i++) {
        // //     System.out.println(arr[i] + " ");
        // // }

        // String[] str = new String[4];
        // for (int i = 0; i < str.length; i++) {
        //     str[i] = in.next();
        // }   

        // System.out.println(Arrays.toString(str));

        // int arr[] = {3, 5, 68, 39, 46};
        // for (int i : arr) {
        //     System.out.println(i);
        // }

        //Passing array to method

        int a[] = {2, 5, 33, 476};
        min(a);
    }

    static void min(int arr[]) {
        int min = arr[0];
        
        for (int i=1; i<arr.length; i++) {
            if (min>arr[1])
            min = arr[i];
        }
    }
}
