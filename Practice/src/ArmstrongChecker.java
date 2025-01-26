import java.util.Scanner;

public class ArmstrongChecker {
    
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Armstrong Number: ");
        int num = in.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
