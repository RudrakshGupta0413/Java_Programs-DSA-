public class Pos {
    static void genAllPos(String result) {
        for(char c = 'A'; c <= 'Z'; c++) {
            if(c=='A' || c=='E' || c =='I' || c=='O' || c=='U')
            genAllPos(result + c);
        }
    }

    public static void main(String[] args) {
        genAllPos(result:"", depth:2);
    }
}
