package homework.ball.ball1;

public class BallTest {
    public void playBall(IBall ball) {
        ball.play();
    }

    public class Inner_m implements IBall {
        @Override
        public void play() {
            System.out.println("成员内部类，打篮球");
        }
    }

    public Object info() {
        class Inner_f implements IBall {
            @Override
            public void play() {
                System.out.println("==============");
                System.out.println("方法内部类，打乒乓球");
            }

        }
        return "123";
    }
}
