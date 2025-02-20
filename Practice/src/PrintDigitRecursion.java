public class PrintDigitRecursion {
    static void printDigit(int n) {
        //Base Case
        if (n == 0) {
            return; //Stack Fall
        }
        //Small Problem
        printDigit(n / 10);
        System.out.println(n % 10); //Post Processing
    }

    public static void main(String[] args) {
        printDigit(67786);
    }
}
