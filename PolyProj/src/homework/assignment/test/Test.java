package homework.assignment.test;

import homework.assignment.Balloon;
import homework.assignment.Bird;
import homework.assignment.IFly;
import homework.assignment.Plane;

public class Test {
    public static void main(String[] args){
        IFly plane = new Plane();
        IFly bird = new Bird();
        IFly balloon = new Balloon();
        plane.fly();;
        bird.fly();
        balloon.fly();
    }
}
