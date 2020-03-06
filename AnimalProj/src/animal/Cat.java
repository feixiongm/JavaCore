package animal;

public class Cat extends Animal {
    private double weight;

    static {
        System.out.println("我是子类的静态代码块");
    }

    {
        System.out.println("我是子类的构造代码块");
    }

    public Cat() {
        System.out.println("我是子类的无参构造");
    }

    public Cat(String name, int month) {
        //通过super（）可以调用父类允许被访问的其他构造方法
        //子类默认调用父类无参构造
        //super（）必须放在子类构造方法第一行
        super(name, month);
        System.out.println("我是子类的代参构造");
    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName() + " is a " + this.getSpecies() + " is running");
    }
}
