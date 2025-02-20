public class SumOfDigit {

    // Sum Of Digit - Stack Building Approach

    static void sumOfDigit(int num, int sum) {
        // Base Case
        if(num == 0) {
            System.out.println(sum);
            return;
        }

        int digit = num % 10;
        sum = sum + digit;
        sumOfDigit(num / 10, sum);
    }
    public static void main(String[] args) {
        sumOfDigit(25246, 0);
    }
}
