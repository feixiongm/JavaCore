package MaxValue;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        String a = dan.next();
        a = a.toLowerCase();
        switch (a) {
            case "monday":
                System.out.println("星期一");
                break;
            case "tuesday":
                System.out.println("星期二");
                break;
            case "wednesday":
                System.out.println("星期三");
                break;
            case "thursday":
                System.out.println("星期四");
                break;
            case "friday":
                System.out.println("星期五");
                break;
            case "saturday":
                System.out.println("星期六");
                break;
            case "sunday":
                System.out.println("星期日");
                break;

            default:
                System.out.println("没有");
        }
    }
}
