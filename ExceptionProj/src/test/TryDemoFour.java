package test;

import java.util.Scanner;

public class TryDemoFour {
    public static void main(String[] args) {
        //描述酒店入住规则:限定年龄：18一下，80以上必须有亲友陪同
        try {
            testAge();
        } catch (HotelAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("工作人员不允许办理入住登记");
            //e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void testAge() throws HotelAgeException{
        System.out.println("请输入年龄");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18 || age > 80) {
            throw new HotelAgeException();
        } else {
            System.out.println("huanying");
        }
    }
}
