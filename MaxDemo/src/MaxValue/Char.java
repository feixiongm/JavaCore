package MaxValue;

public class Char {
    public static void main(String[] args){
        int i = 10;
        String s = "hello";
        s += i;
        s += s;
        int a = 3;
        a += a *= a;
        int b = 3;
        b++;
        int c = 5;
        c--;
        //System.out.println(c-c+ "");
        //int x = 4, y=0;
       // y = (--x) + (3 + 5*2);
       // System.out.println(y);
        int x = 5, y = 6;
        int n = (x++)                                              + (y + 1);
        System.out.println(n);
    }
}
