import java.util.Scanner;

public class InputDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner is the reference variable of Scanner class
        // and new is creating the object which is assinging it to the reference variable
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();  //nextInt is for taking the inpiut from the user
        System.out.println("The number is: " + n);
        int n2 = scanner.nextInt();
        System.out.println("The number is: " + n + " " + n2);
        scanner.close();
    }
}
