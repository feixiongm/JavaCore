package cat;

public class Cat {
    String name;
    int month;
    double weight;
    String species;

    public Cat(String name, int month, double weight, String species) {
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
    }

    public void run() {
        System.out.println("小猫快跑");
    }

    public void run(String name) {
        System.out.println(name + "带参数快跑");
    }
}
