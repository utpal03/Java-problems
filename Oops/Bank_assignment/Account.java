package Oops.Assignment;

import java.util.Scanner;

public class Account {
    private String type;
    private long account_number;
    private double min_balance;
    private double cur_balance;

    final int rate = 12; // Rate is fixed of this bank

    public Account(String type, long account_number, double min_balance, double cur_balance) {
        this.type = type;
        this.account_number = account_number;
        this.min_balance = min_balance;
        this.cur_balance = cur_balance;
    }

    public double getCur_balance() {
        return cur_balance;
    }

    public void setcur_balance(double cur_balance) {
        this.cur_balance = cur_balance;
    }

    public double getmin_balance() {
        return min_balance;
    }

    public void setmin_balance(double min_balance) {
        this.min_balance = min_balance;
    }

    public long getaccount_number() {
        return account_number;
    }

    public void setaccount_number(long account_number) {
        this.account_number = account_number;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public double calIntrest() {
        System.out.println("Enter time in monts to calculate interest: ");
        try (Scanner sc = new Scanner(System.in)) {
            int time = sc.nextInt();
            double interest = (getCur_balance() * rate * time) / 12 * 100;
            return interest;
        }
    }
}
