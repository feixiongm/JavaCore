package phoneTest;

public interface IFather {
    void say();
    default void connection(){
        System.out.println("这是IFather中的connection");
    }
}
