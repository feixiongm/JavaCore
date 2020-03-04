package anonymous.test;

//import anonymous.Man;

import anonymous.Person;
//import anonymous.Woman;

public class PersonTest {
    //根据传入的不同人的类型，调用不同的类的方法
    //方案1
//    public void getRead(Man man){
//        man.read();
//    }
//    public void getRead(Woman woman){
//        woman.read();
//    }
//
    public void getRead(Person person) {
        person.read();
    }

    public static void main(String[] args) {
        PersonTest test = new PersonTest();
//        Man one = new Man();
//        Woman two = new Woman();
//        test.getRead(one);
//        test.getRead(two);
        //方案3，匿名内部类
        /*
        1，匿名内部类没有类型名称，实例对象名称
        2，编译后的文件命名：外部类$数字.class
        3，无法使用private，public，abstract，static，修饰
        4，无法编写构造方法
        5，不能出现静态成员
        6，匿名内部类可以实现接口也可以继承父类，但不可兼得
         */
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("男人喜欢看科幻书");
            }
        });
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("女生喜欢言情小说");

            }
        });
    }
}
