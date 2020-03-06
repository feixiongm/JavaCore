package test;

import animal.Cat;
import animal.Dog;

public class Test {

    public static void main(String[] args){
        Cat one = new Cat();
        one.setName("huahua");
        one.setSpecies("tian yuan mao");
        one.eat();
        one.run();
        System.out.println("===================");
        Dog two = new Dog();
        two.setName("niuniu");
        two.setMonth(1);
        two.eat();
        two.sleep();
        System.out.println("===================");
        two.eat("fanfan");
    }
}
