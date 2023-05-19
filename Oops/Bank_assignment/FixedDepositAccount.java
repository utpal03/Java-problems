package Oops.Assignment;

public class FixedDepositAccount extends Account {
    private int term;

    FixedDepositAccount(String type, long account_number, double min_balance, double cur_balance, int term) {
        super(type, account_number, min_balance, cur_balance);
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
