package people;

public class PeopleTest {
    public static void main(String[] args) {
        Person lily = new Person();
        lily.age = 12;

//        //获取内部类对象实例，方式1：new 外部类.new 内部类
//        Person.Heart myHeart = new Person().new Heart();
//        System.out.println(myHeart.beat());
//
//
//        //获取内部类对象实例，方式2：外部类对象.new.内部类
//        myHeart = lily.new Heart();
//        System.out.println(myHeart.beat());
//
//        //获取内部类对象实例，方式3：外部类对象.获取方法
//        myHeart = lily.getHeart();
//        System.out.println(myHeart.beat());
//        myHeart.eat();
//        Person a = new Person();
//        a.eat();

        //获取静态内部类对象的方法
//        Person.Heart myHeart = new Person.Heart();
//        System.out.println(myHeart.beat());
//        myHeart.eat();
//        System.out.println(Person.Heart.age);
//        Person b= new Person();
//        System.out.println(b.age);

        System.out.println(lily.getHeart());
    }
}
