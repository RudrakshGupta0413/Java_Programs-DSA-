public class PyramidPattern {
    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int row = 1; row <= n; row++) {
    //         for (int space = 1; space <= n - row; space++) {
    //             System.out.print(" ");
    //         }
    //         for (int col = 1; col <= row; col++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            int odd = 2 * row - 1;
            // int odd = 2 * row + 1; // this is for when we start from 0
            for (int col = 1; col <= odd; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 