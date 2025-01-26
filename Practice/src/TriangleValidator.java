import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sides of the trinagle:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
        scanner.close();
    }
}
