package shape;



public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
