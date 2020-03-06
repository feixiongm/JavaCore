package com.thread;
class MyThread extends Thread{
    public void run(){
        System.out.println(getName() + "Thread is running");
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("Thread1");
        MyThread mt = new MyThread();
        mt.start();// start the thread
        //mt.start();
        System.out.println("Thread2");

    }
}
