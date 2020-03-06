package MaxValue;

public class ArgsDemo1 {
    public void search(double n, double... a){
        boolean flag = false;
        for(double i : a){
            if(i == n){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("找到" + n);
        }else{
            System.out.println("没找到" + n);
        }
    }
    public static void main(String[] args){
        ArgsDemo1 dan = new ArgsDemo1();
        double[] a = new double[]{1,2,3,4,5,5.5,6};
        dan.search(5.5, a);
    }
}
