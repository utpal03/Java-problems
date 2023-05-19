package Oops.Assignment;

public class CurrAccount extends Account {
    private double overdraftLimit;

    CurrAccount(String type, long account_number, double min_balance, double cur_balance, double overdraftLimit) {
        super(type, account_number, min_balance, cur_balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getoverdraftLimit() {
        return overdraftLimit;
    }

    public void setoverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
