public class PrimeNumber {
    public static void main(String[] args) {
        // Scanner scanner = new scanner(System.in);
        int n = 37, c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("It is a Prime Number");
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("It is not a Prime Number");
        }

    }
}
