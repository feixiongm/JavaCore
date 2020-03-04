package tel;

//接口访问修饰符： public
public interface INet {
    /*
    当类实现接口时，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类
     */
    public abstract void netWork();

    //接口中可以包含常量，自动加public static final
    int TEMP = 20;
    //default：默认方法，可以带方法体
    //可以在实现类中重写，并可以通过接口的引用调用
    default public void connection(){
        System.out.println("我是接口中的默认链接");
    };
    //static：静态方法，可以带方法体
    //不可以在实现类中重写，可以同接口名调用
    static void stop(){
        System.out.println("我是接口中的静态方法");
    }

}
