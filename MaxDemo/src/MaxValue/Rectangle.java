package MaxValue;

public class Rectangle extends Shape {
    private double a;
    private double b;
    private double area;
    public void area(double a, double b){

        area = a * b;
    }
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }

    @Override
    public double getArea() {
        Rectangle one = new Rectangle();

        System.out.println(a * b);
        return a * b;
    }
}
