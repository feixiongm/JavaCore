package com.bank;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("abc",1000);
        SaveAccount saveAccount = new SaveAccount(bank);
        WithdrawAccount withdrawAccount = new WithdrawAccount(bank);
        Thread save = new Thread(saveAccount);
        Thread withdraw = new Thread(withdrawAccount);
        save.start();
        withdraw.start();
        try {
            withdraw.join();
            save.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bank);

    }
}
