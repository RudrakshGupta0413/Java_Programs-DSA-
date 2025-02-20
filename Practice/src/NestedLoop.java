public class NestedLoop {
    // break vs contine vs return
    // return - exit from the funtion
    public static void main(String[] args) {
        // Labelled Loop
        outer:
        for (int i = 1; i <= 3; i++) {       //first the outer the loop will run then the inner loop will run until the condition is reached.
            for ( int j = 1; j <= 3; j++) { 
                if (i == j) {
                    continue outer;
                    //return; exit from the function
                    //continue; //skip the current iteration
                    //break;  //exit from the current loop
                } 
                System.out.println("I is " + i + " J is " + j);
            }
        }
    }
}
