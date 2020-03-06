package MaxValue;

import java.util.Scanner;

public class area{
    public double cal(double m, double n){
        double rec = 0;
        rec = m * n;
        System.out.println("长方形面积为" + rec);
        return rec;
    }
    public double cal(double r){
        double S = 0;
        S = Math.PI * Math.pow(r,2);
        System.out.println("圆面积为" + S);
        return S;
    }
    public static void main(String[] args){
        area xiong = new area();
        Scanner a = new Scanner(System.in);
        double r = a.nextInt();
        double m = a.nextInt();
        double n = a.nextInt();
        xiong.cal(r);
        xiong.cal(m, n);
    }
}
