package animal;

public class Sheep1 extends Animal1{
    public Sheep1() {
    }

    public Sheep1(String kind) {
        super(kind);
    }

    @Override
    public void cry() {
        System.out.println("mie");
    }
}
