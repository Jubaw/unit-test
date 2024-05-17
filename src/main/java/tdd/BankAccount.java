package tdd;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {


    private String accountNumber;

    private double balance;

    private double dailyWithdrawLimit;

    private double dailyWithdrawAmount;

    private List<String> history = new ArrayList<>();


    public BankAccount(String accountNumber, double balance, double dailyWithdrawnLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dailyWithdrawLimit = dailyWithdrawnLimit;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }
    public Double getDailyWithdrawLimit(){
        return this.dailyWithdrawLimit;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDailyWithdrawAmount(double dailyWithdrawAmount) {
        this.dailyWithdrawAmount = dailyWithdrawAmount;
    }

    public void setDailyWithdrawLimit(double dailyWithdrawLimit) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }
}
