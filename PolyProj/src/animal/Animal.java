package animal;

//抽象类：不允许实例化，可以通过向上转型，指向子类实例
public abstract class Animal {

    private String name;
    private int month;

    public Animal(){

    }

    public Animal(String name, int month){
        this.name = name;
        this.month = month;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }
    public abstract void eat();

    public static void say(){
        System.out.println("hello");
    }
}
