public class HollowPattern {
    //  public static void main(String[] args) {
    //     int n = 5;
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             if ( row == n || col == 1 || row == col) {
    //                 System.out.print("*"); 
    //             }
    //             else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n - row + 1; col++) {
    //             if ( col == 1 || row == 1 || col == n - row + 1) {
    //                 System.out.print("*"); 
    //             }
    //             else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row ; col++) {
                if ( col == 1 || row == 1 || col == n - row + 1) {
                    System.out.print("*"); 
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

