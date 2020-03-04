package animal;

public class Dog extends Animal {
    //属性：性别
    private String sex;

    public Dog() {

    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.sex = sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
    //方法：睡觉

    public void sleep(){
        System.out.println("小狗有午睡的习惯");
    }


    //吃东西方法（重写父类）

    @Override
    public void eat() {
        System.out.println("狗吃肉～～");
    }
}
