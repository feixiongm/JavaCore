package anmial;

public class Cat {
    private String name;
    private int month;
    private double weight;
    private String species;

    public static int price;

    public Cat() {
        System.out.println("我是宠物猫");
    }

    public Cat(int month) {
        this.setMonth(month);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "我是一只名叫" + this.name + "的猫咪";
    }

    public void setMonth(int month) {
        if (month <= 0)
            System.out.println("年龄必须大于0");
        else
            this.month = month;

    }

    public int getMonth() {
        return month;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void run() {
        eat();
        Cat.price = 30;
        System.out.println("the price is " + Cat.price + this.name + "run");
    }

    public static void eat() {
        System.out.println("eat");
    }
}
