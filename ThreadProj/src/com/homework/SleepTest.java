package com.homework;

class Letter implements Runnable {
    @Override
    public void run() {

        String helloworld = "helloworld";
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(char i : a){
            System.out.print(i + " ");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class SleepTest{
    public static void main(String[] args) {
        Letter one = new Letter();
        Thread thread = new Thread(one);
        thread.start();
    }
}