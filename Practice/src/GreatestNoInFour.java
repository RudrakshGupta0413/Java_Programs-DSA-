public class GreatestNoInFour {
    public static void main(String[] args) {
        int a = 335;
        int b = 560;
        int c = 220;
        int d = 93;
        int result;
        
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    result = a;
                }
                else {
                    result = b;
                }
            }
            else if (c > d) {
                result = c;
            }
            else {
                result = d;
            }
        }
        else if (b > c) {
            if (b > d) {
                result = b;
            }
            else {
                result = d;
            }
        }
        else if (c > d) {
            result = c;
        }
        else {
            result = d;
        }
        System.out.println("The Greatest Number is: " + result);
    }
}
