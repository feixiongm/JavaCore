package com.thread1;
class MyThread extends Thread{


    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(i <= 10){
            System.out.println(getName() + " is running " + i);
            i++;
        }
//        for(int i = 1; i <= 10; i++){
//            System.out.println(getName() + "is running" + i);
//        }
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        MyThread mt1 = new MyThread("thread1");
        MyThread mt2 = new MyThread("thread2");

    }

}
