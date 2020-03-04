package tel;

public class SmartPhone implements INet, Iphoto {
    public static final int TEMP = 30;

    public void call() {
        System.out.println("智能电话可以打电话");
    }

    public void message() {
        System.out.println("智能电话可以发短信");
    }

    public void netWork() {
        System.out.println("智能电话可以上网");
    }

    @Override
    public void connection() {
       // INet.super.connection();//调用接口中默认的方法
        System.out.println("智能电话可以上网");
    }

    @Override
    public void photo() {

    }
}
