import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        int wordCount = 0;

        //Scanner - buffer
        Scanner scanner = new Scanner(System.in); // System.in is for input taking

        while (scanner.hasNext()) {
            wordCount++; // counting the words
            System.out.println(scanner.next());
        }
        System.out.println("Total words are" + wordCount);
        scanner.close();  // buffer close used for good practice
    }
}
