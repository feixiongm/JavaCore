package MaxValue;

public class maxdemo {
    public void max(float a, float b){
        float m;
        if (a > b){
            m = a;
        }else{
            m = b;
        }
        System.out.println("两个数" + a + "和" + b + "的最大值为：" + m);
    }
    public static void main(String[] args){
        maxdemo max = new maxdemo();
        float c = 5.0f, b = 3.0f;
        max.max(c,b);
        max.max(10,5);

    }
}
