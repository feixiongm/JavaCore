package phoneTest;

public interface IFather2 {
    void fly();
    default void connection(){
        System.out.println("这是IFather2中的connection");
    }
}
