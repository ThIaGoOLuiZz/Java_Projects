package Model;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names.add(names);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Account account) {
        this.accounts.add(account);
    }
}
