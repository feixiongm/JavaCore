package com.runnable;

class PrintRunnable implements Runnable{
    int i = 1;
    @Override
    public void run() {
        //int i = 1;
        while(i <= 10){
            System.out.println(Thread.currentThread().getName() + " is running" + i);
            i++;
        }
    }
}

public class Test {

    public static void main(String[] args) {
        PrintRunnable pr = new PrintRunnable();
        Thread t1 = new Thread(pr,"thread1");
        t1.start();
        PrintRunnable pr1 = new PrintRunnable();
        Thread t2 = new Thread(pr,"thread2");
        t2.start();
    }
}
