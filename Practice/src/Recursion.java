public class Recursion {
    static void printName(int num) {
        if (num == 0 || num == 2) {
            return;
        }
        System.out.println("Hello" + num);
        printName(num - 1);
        System.out.println("Rudraksh" + numPrint);
    }

    public static void main(String[] args) {
        printName(5);
    }
}