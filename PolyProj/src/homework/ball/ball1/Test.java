package homework.ball.ball1;

public class Test {
    public void getIBall(IBall ball){
        ball.play();
    }
    public static void main(String[] args) {
        BallTest ball = new BallTest();
        Test one = new Test();
        BallTest.Inner_m Inn = new BallTest().new Inner_m();
        Inn.play();
        System.out.println(ball.info());
    }

}
