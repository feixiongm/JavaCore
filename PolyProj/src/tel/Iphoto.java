package tel;
/*
具有照相能力的接口
 */
public interface Iphoto {
    public void photo();
    public default void connection(){
        System.out.println("这是我的Iphoto的connection");
    }
}
