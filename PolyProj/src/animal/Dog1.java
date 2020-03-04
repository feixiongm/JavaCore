package animal;

public class Dog1 extends Animal1 {
    public Dog1(){

    }
    public Dog1(String kind){
        this.setKind(kind);
    }
    @Override
    public void cry() {
        System.out.println("wang");
    }
}
