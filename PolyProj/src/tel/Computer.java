package tel;

public class Computer implements INet{
    public void photo(){
        System.out.println("电脑可以拍照");
    }
    public void network(){
        System.out.println("电脑可以上网");
    }
    public void game(){
        System.out.println("电脑可以玩游戏");
    }

    @Override
    public void netWork() {
        System.out.println("电脑可以上网");
    }

    @Override
    public void connection() {
        System.out.println("电脑可以上网");

    }
}
