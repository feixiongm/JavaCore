package wrap;

import org.omg.PortableInterceptor.INACTIVE;

public class WrapperTest {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        System.out.println(one == two);

        Integer three = 100; //自动装箱
        System.out.println(three == 100);

        Integer four = 100;
        System.out.println(three == four);

        Integer five = 200;
        System.out.println(five == 200);

        Integer six = 200;
        System.out.println(five == six);
        String s1 = "   a  v   b  ";
        byte[] a = s1.trim().getBytes();
        System.out.println(s1);
        System.out.println(a);
    }
}
