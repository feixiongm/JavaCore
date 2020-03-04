package animal;

public class Master {

    //方案1：编写方法，传入不同类型的动物，调用各自的方法
//    public void feed(Cat cat){
//        cat.eat();
//        cat.playBall();
//    }
//    public void feed(Dog dog){
//        dog.eat();
//        dog.sleep();
//    }

    //方案2：编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
    public void feed(Animal obj){
        if(obj instanceof Cat){
            Cat temp = (Cat)obj;
            temp.eat();
            temp.playBall();
        }else if(obj instanceof Dog){
            Dog temp = (Dog)obj;
            temp.sleep();
            temp.eat();
        }
    }

    /*
    饲养何种宠物
    空闲时间多：养狗
    空闲时间不对：养猫
     */
    //方案1：
//    public Dog hasManyTime(){
//        System.out.println("有时间，适合养狗");
//        return new Dog();
//    }
//    public Cat hasLittleTime(){
//        System.out.println("没时间，适合养猫");
//        return new Cat();
//    }

    //方案2：
    public Animal raise(boolean isManyTime){
        if(isManyTime){
            System.out.println("有时间，适合养狗");
            return new Dog();
        }else{
            System.out.println("没时间，适合养猫");
            return new Cat();
        }

    }
}
