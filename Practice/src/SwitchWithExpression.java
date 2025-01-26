public class SwitchWithExpression {
    public static void main(String[] args) {
        //User input for 1. Tea 2. Coffee 3. Cold Drink 4. Juice
        String result = switch (3) {                             // colon : vs arrow -> Interview Question
            case 1 -> "Rs 50";
            case 2 -> "Rs 100";
            case 3 -> {
                int c = 100;
                int d = c * c;
                yield "Rs 150";  // Java 14 Release
            }
            case 4 -> "Rs 70";
            default -> "Wrong Choice...";
        };
        System.out.println(result);
    }
}
