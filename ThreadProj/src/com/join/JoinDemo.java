package com.join;


class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 300; i ++){
            System.out.println(getName() + " is running" + i + "times");
        }
    }
}

public class JoinDemo {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int i = 1; i < 20; i++) {
            System.out.println("main thread is running" + i + "times");
        }
        System.out.println("main thread is dead");

    }
}
