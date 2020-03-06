package animal;

public class Cat {
    //属性：昵称，年龄，体重，品种
    String name;
    int month;
    double weight;
    String species;

    public Cat(){
        System.out.println("我是无参构造");
    }

    public Cat(String name){
        System.out.println("我是代参构造");
    }

    public Cat(String name, int month, double weight, String species){
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
    }

    //方法：跑动，吃东西
    //跑动的方法
    public void run(){
        System.out.println("小脑会跑");
    }
    public void run(String name){
        System.out.println(name + "快跑");
    }
    //吃东西的方法
    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
