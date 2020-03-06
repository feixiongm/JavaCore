package fruit;

public final class Waxberry extends Fruits {
    private String color;

    public Waxberry(String shape, String taste, String color) {
        super(shape, taste);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public final void face(){
        System.out.println("waxberry," + this.getColor() + this.getShape() + "果味酸甜适中");
    }

    @Override
    public void eat() {
        System.out.println("杨梅酸甜适中，非常好吃");
    }

    @Override
    public String toString() {
        return this.getShape() + this.getColor() + this.getTaste();
    }
}
