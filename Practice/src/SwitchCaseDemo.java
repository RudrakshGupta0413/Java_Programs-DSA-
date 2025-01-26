public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("1.Tea");
        System.out.println("2.Coffee");
        System.out.println("3.Cold Drink");
        System.out.println("4.Juice");

        int choice = 3;
        switch (choice) {
            case 1:
                System.out.println("Rs 50");
                break;
            case 2:
                System.out.println("Rs 190");
                break;
            case 3:
                System.out.println("Rs 40");
                break;
            case 4:
                System.out.println("Rs 70");
                break;
            default:
            System.out.println("Wrong Choice...");
        }

        //Switch case with STRING
        // String x = "tea";
        // switch(x) {
        //     case "tea":
        //     System.out.println("Rs 50");
        // }
    }
}
