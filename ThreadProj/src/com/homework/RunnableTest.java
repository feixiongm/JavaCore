package com.homework;

class Dog implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while(i <= 3){
            System.out.println(Thread.currentThread().getName() + "dog"+ i);
            i++;
        }
    }
}

class Cat implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while(i <= 3){
            System.out.println(Thread.currentThread().getName() + "cat" + i);
            i++;
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            System.out.println("main thread");
        }
        Dog one = new Dog();
        Thread t1 = new Thread(one);
        Cat two = new Cat();
        Thread t2 = new Thread(two);
        t1.start();
        t2.start();
    }
}
