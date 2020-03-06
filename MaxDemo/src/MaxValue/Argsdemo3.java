package MaxValue;

public class Argsdemo3 {
    public void plus(int a, int b){
        int c = a + b;
        System.out.println("不带" + c);
    }
    public void plus(int... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        System.out.println("dai" + sum);
    }
    public static void main(String[] args){
        Argsdemo3 dan = new Argsdemo3();
        dan.plus(1,2);
    }
}
