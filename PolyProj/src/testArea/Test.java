package testArea;

import shape.Circle;
import shape.Rectangle;

public class Test {
    public static void main(String[] args){
        Circle one = new Circle(10);
        Rectangle two = new Rectangle(10,20);
        System.out.println(one.area());
        System.out.println(two.area());
    }
}
