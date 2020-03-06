package anmial;

public class CatTest {
    public static void main(String[] args) {

        Cat one = new Cat();
        one.setName("凡凡");
        one.setMonth(3);
        one.setWeight(1200);
        one.setSpecies("中华田园猫");
        Cat.eat();
        if (one.getMonth() <= 0) {
            return;
        } else {
            System.out.println(one.getName());
            System.out.println(one.getMonth());
        }
        System.out.println(one.getWeight());
        System.out.println(one.getSpecies());

    }
}
