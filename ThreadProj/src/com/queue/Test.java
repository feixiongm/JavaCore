package com.queue;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();

        //new Thread(new Producer(queue)).start();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Thread thread = new Thread(producer);
        Thread thread1 = new Thread(consumer);
        thread.start();
        thread1.start();
    }
}
