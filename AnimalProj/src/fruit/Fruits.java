package fruit;

import com.sun.deploy.security.SelectableSecurityManager;

public class Fruits {
    private String shape;
    private String taste;

    public Fruits() {
    }

    public Fruits(String shape, String taste) {
        this.setShape(shape);
        this.setTaste(taste);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public void eat(){
        System.out.println("Fruits can be eaten");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        Fruits temp = (Fruits) obj;
        if(this.getShape().equals(((Fruits) obj).getShape()) && this.getTaste().equals(((Fruits) obj).getTaste()))
            return true;
        else
            return false;
    }
    public boolean equals(Fruits obj){
        if(obj == null)
            return false;
        if(this.getTaste().equals(obj.getTaste()) && this.getShape().equals(obj.getShape()))
            return true;
            else;
                return false;
    }
}
