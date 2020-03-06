package com.bank;

public class WithdrawAccount implements Runnable{
    Bank bank;

    public WithdrawAccount(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.withdrawAccount();
    }
}
