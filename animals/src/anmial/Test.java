package anmial;

public class Test {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.setName("花花");
        one.setMonth(2);
        one.setSpecies("英国短毛猫");

        one.run();
        Cat.price = 2000;
        System.out.println(Cat.price);
    }
}
