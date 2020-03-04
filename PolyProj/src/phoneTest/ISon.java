package phoneTest;

public interface ISon extends IFather, IFather2 {
    void run();

    default void connection() {
        System.out.println("这是ISon中的connection");
    }
}
