package animal;

public class Animal {
    private String name;
    protected int month;
    private String species;


    static {
        System.out.println("我是父类的静态代码块");
    }

    {
        System.out.println("我是父类的构造代码块");
    }

    public Animal() {
        System.out.println("我是父类的无参构造");
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
        System.out.println("我是父类的代参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(this.getName() + " is eating");
    }

    public void eat(String name) {
        System.out.println(name + " is eating");
    }

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        Animal temp = (Animal)obj;
        if(this.getName().equals(temp.getName()) && this.getMonth() == temp.getMonth())
            return true;
        else
            return false;
    }
    public boolean equals(Animal obj){
        if(obj == null)
            return false;

        if(this.getName().equals(obj.getName()) && this.getMonth() == obj.getMonth())
            return true;
        else
            return false;
    }
    public String toString(){
        return "name" + this.getName() + "age" + this.getMonth();
    }
}
