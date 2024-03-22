package Model;

import java.util.ArrayList;

public class Account {
    private ArrayList depositsMoves = new ArrayList();
    private ArrayList withdrawMoves = new ArrayList();
    private ArrayList totalMoves = new ArrayList();

    public ArrayList getWithdrawMoves() {
        return withdrawMoves;
    }

    public void setWithdrawMoves(String withdrawMoves) {
        this.withdrawMoves.add(withdrawMoves);
    }

    public ArrayList getTotalMoves() {
        return totalMoves;
    }

    public void setTotalMoves(String moves) {
        this.totalMoves.add(moves);
    }

    public ArrayList<Movement> getDepositsMoves() {
        return depositsMoves;
    }

    public void setDepositsMoves(String move) {
        this.depositsMoves.add(move);
    }

    private String nameAccount;
    private int type;
    private double balance;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = this.balance + balance;
    }
}
