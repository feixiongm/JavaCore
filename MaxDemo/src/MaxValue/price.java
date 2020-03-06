package MaxValue;

public class price {
    public void discount(double oldprice) {
       double newprice;
        if(oldprice < 100){
            newprice = oldprice;
        }else if (oldprice <= 199 && oldprice >= 100){
            newprice = 0.5 * oldprice;
        }else{
            newprice = 0.25 * oldprice;
        }
        System.out.println(newprice);
    }
    public static  void main(String[] args){
        price realprice = new price();
        double i = 1000;
        realprice.discount(i);
    }
}
