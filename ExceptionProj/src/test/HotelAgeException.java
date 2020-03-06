package test;

public class HotelAgeException extends Exception {
    public HotelAgeException(){
        super("18一下，80以上必须有亲友陪同");
    }
}
