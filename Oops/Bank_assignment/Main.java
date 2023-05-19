package Oops.Assignment;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Saving", 957243254, 2000, 260000);
        Costumer c1 = new Costumer("micky", "Hilsa", account1);
        System.out.println(c1.getName());
        System.out.println(c1.getaddress());

        FixedDepositAccount f1 = new FixedDepositAccount("Current", 12345678, 10000, 150000, 100);
        Costumer c2 = new Costumer("Utpal", "Jehanabad", f1);
        System.out.println(c2.getName());
        System.out.println(c1.getAccount().gettype());
        double netintrest = f1.calIntrest();
        System.out.println(netintrest);
    }
}
