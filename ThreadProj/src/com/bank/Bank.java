package com.bank;

import java.util.concurrent.TransferQueue;

public class Bank {

    private String name;
    private int balance;

    public Bank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank" + "Account: " + name + ", balance: " + balance;
    }

    public synchronized void saveAccount(){
        int balance = getBalance();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        balance += 100;
        setBalance(balance);
        System.out.println("存款后的余额为：" + balance);
    }

    public void withdrawAccount() {
        synchronized (this) {
            int balance = getBalance();
            balance = balance - 200;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            setBalance(balance);
            System.out.println("取款后的余额为：" + balance);
        }
    }
}
