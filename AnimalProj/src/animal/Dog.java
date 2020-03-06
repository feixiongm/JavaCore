package animal;

public class Dog extends Animal {
    private String gender;

    public Dog(){

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(this.getName() + "is" + this.getMonth() + ", now is sleeping");
    }

    //override method
    public void eat(){
        System.out.println(this.getName() + " dont want to eat");
    }
    public void eat(String month){
        System.out.println(month + " dont want to eat");
    }
}
