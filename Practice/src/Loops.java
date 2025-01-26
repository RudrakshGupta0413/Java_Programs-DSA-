public class Loops {
    public static void main(String[] args) {
        // loops is for repetation
        // for, while, do while
        // for we know the number of iterations
        // while we don't know the number of iterations
        // do while is same as while but it will execute atleast once

        //for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }   

        //while loop
        int j = 1;
        while (j <= 10) {
            if(j%2 == 0) {
                j++;
            }
            else {
                j += 2;
            }
        }
        
        //do while loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
    }
}
