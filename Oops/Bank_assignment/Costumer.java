package Oops.Assignment;

public class Costumer {
    private String name;
    private String address;
    private Account account;

    Costumer(String name, String address, Account account) {
        this.name = name;
        this.address = address;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setaccount(Account account) {
        this.account = account;
    }
}
