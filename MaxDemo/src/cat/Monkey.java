package cat;

public class Monkey {
    String name;
    String feature;

    public Monkey() {
        System.out.println("我是使用无参构造生产的猴子");
        name = "长尾巴";
        feature = "尾巴长";
        System.out.println("名称： " + name);
        System.out.println("特征： " + feature);
    }

    public Monkey(String name, String feature) {
        System.out.println("======================");
        System.out.println("我是使用有参构造生产的猴子");
        this.name = name;
        this.feature = feature;
    }
}
