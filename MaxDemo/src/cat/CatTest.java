package cat;

public class CatTest {
    public static void main(String[] args){
        Cat one = new Cat("丹丹",10,1000,"短毛");
       // Cat two = new Cat();

        System.out.println(one.month);
        one.run("one");
        one.run();
    }
}
