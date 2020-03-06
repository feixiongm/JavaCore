package cat;

public class MonkeyTest {
    public static void main(String[] args) {

        Monkey one = new Monkey();
        Monkey two = new Monkey("头上有白毛", "喜欢吃树叶");
        System.out.println("名称： " + two.name);
        System.out.println("特征： " + two.feature);

    }
}
