package com.priority;

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 1; i < 10; i++) {
            System.out.println("Thread" + name + " is running " + i);
        }
    }
}

public class PriorityDemo {

    public static void main(String[] args) {
        //get the priority of thread
        MyThread mt1 = new MyThread("thread 1");
        int mainPriority = Thread.currentThread().getPriority();
        //mt1.start();
        //mt1.setPriority(10);
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt1.start();
//        System.out.println(mainPriority);
//        System.out.println(mt1.getPriority());
//        System.out.println(mainPriority);
        MyThread mt2 = new MyThread("thread 2");
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt2.start();


    }
}
