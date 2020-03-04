package animal;

public class Cat1 extends Animal1 {
    public Cat1(String kind) {
        System.out.println(kind);
    }

    @Override
    public void cry() {
        System.out.println("miao");
    }
}
