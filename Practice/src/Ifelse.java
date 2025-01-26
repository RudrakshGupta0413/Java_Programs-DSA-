public class Ifelse {
    
    public static void main(String [] args) {
        int a = 3;
        int b = 4;
        int c = 6;

        if(a>b) {
            System.out.print("a is greater than b");
            if(a>c) {
                System.out.print("a is graeter than c");
            }
            else {
                System.out.print("c is greater");
            }
        } else {
            if(b>c) {
                System.out.print("b is graeter than c");
            }
            else {
                System.out.print("c is greater ");
            }
        }
    }

   
}
