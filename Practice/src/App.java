import java.util.Arrays;

public class App {
    // public static void main(String[] args) {
    //     int result = App.add(5, 7);
    //     System.out.println("The sum is: " + result);
    // }

    // public static int add(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     String name = "Rudraksh";
    //     greet(name);
    // }

    // static void greet(String name) {
    //     System.out.println("Hello " + name);
    // }

    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5};
        // int sum = 0;
        // for (int number : numbers) {
        //     sum += number;
        // }
        // System.out.println("The sum is: " + sum);
        
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0] = 99;
        arr[3] = 56;
    }
}

