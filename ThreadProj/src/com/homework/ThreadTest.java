package com.homework;


class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println(getName() + i + "is running");
        }
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        MyThread mt1 = new MyThread("thread1");
        MyThread mt2 = new MyThread("thread2");

        mt1.start();
        mt2.start();
    }
}
