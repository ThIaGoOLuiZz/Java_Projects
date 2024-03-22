package View;

import javax.swing.*;
import java.util.ArrayList;


public class InputOutput {
    public static int getIndexMenuZero(){
        String[] options = {"Create a new account","Exit"};
        JComboBox<String> menu = new JComboBox<>(options);

        JOptionPane.showMessageDialog(null, menu, "What do you want?", JOptionPane.DEFAULT_OPTION);
        return menu.getSelectedIndex();
    }
    public static int getIndexMenu(){
        String[] options = {"Create a new account","Deposit","Withdraw","GetBalance","GetDataAccount","GetExtract","GetExtractDeposit","GetExtractWithdraw","Exit"};
        JComboBox<String> menu = new JComboBox<>(options);

        JOptionPane.showMessageDialog(null, menu, "What do you want?", JOptionPane.DEFAULT_OPTION);
        return menu.getSelectedIndex();
    }

    public static String getNameAccount(){
        return JOptionPane.showInputDialog(null, "What's your name?", "Creating a new account", JOptionPane.DEFAULT_OPTION);
    }

    public static int getTypeAccount(){
        String[] options = {"Savings Account","Checkings Account"};
        JComboBox<String> menu = new JComboBox<>(options);

        JOptionPane.showMessageDialog(null, menu, "What's the type of account?", JOptionPane.DEFAULT_OPTION);
        return menu.getSelectedIndex();
    }

    public static double getBalanceAccount(){
        String[] options = {"R$100,00","R$200,00","R$500,00","R$1000,00","Other"};
        JComboBox<String> menu = new JComboBox<>(options);

        JOptionPane.showMessageDialog(null, menu, "What's your first balance?", JOptionPane.DEFAULT_OPTION);
        return switch (menu.getSelectedIndex()) {
            case 0 -> 100.00;
            case 1 -> 200.00;
            case 2 -> 500.00;
            case 3 -> 1000.00;
            default -> Double.parseDouble(JOptionPane.showInputDialog("How many will be your balance"));
        };
    }

    public static String getCPFAccount(){
        return JOptionPane.showInputDialog(null, "What's your CPF?");
    }

    public static void errorCPF(){
        JOptionPane.showMessageDialog(null, "The lenght of your CPF must be 11 charaters!", "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public static int selectAccount(ArrayList accounts){
        String[] options = new String[accounts.size()];

        for(int x=0;x<accounts.size();x++){
            options[x] = accounts.get(x).toString();
        }

        JComboBox menu = new JComboBox(options);
        JOptionPane.showMessageDialog(null, menu, "What account do you want to move?", JOptionPane.DEFAULT_OPTION);

        return menu.getSelectedIndex();
    }

    public static double depositMoney(){
        double deposit;

        do{
            deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "How many do you want to deposit", "Deposit process", JOptionPane.DEFAULT_OPTION));
            if(deposit<0){
                JOptionPane.showMessageDialog(null, "You cannot deposit a negative value! Please insert a valid value.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if(deposit==0){
                JOptionPane.showMessageDialog(null, "You cannot deposit a value equals to zero! Please insert a valid value.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (deposit<=0);

        return deposit;
    }
    public static void showBalance(double balance, String name){
        JOptionPane.showMessageDialog(null, "Current balance: R$" + balance, "Account: " + name, JOptionPane.DEFAULT_OPTION);
    }

    public static double withdrawMoney(){
        double deposit;

        do{
            deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "How many do you want to withdraw", "Withdraw process", JOptionPane.DEFAULT_OPTION));
            if(deposit<0){
                JOptionPane.showMessageDialog(null, "You cannot withdraw a negative value! Please insert a valid value.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if(deposit==0){
                JOptionPane.showMessageDialog(null, "You cannot withdraw a value equals to zero! Please insert a valid value.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (deposit<=0);

        return -deposit;
    }

    public static void errorMessage(double total, double newBalance){
        JOptionPane.showMessageDialog(null, "You cannot withdraw " + newBalance + ", because your balance would be: R$" + total);
    }

    public static void showDataAccount(String name, int type, double balance, String cpf){
        String types = "";

        if(type == 0){
            types = "Savings Account";
        }
        else{
            types = "Checkings Account";
        }


        JOptionPane.showMessageDialog(null, "Name: " + name + "\n" + "Type: " + types + "\n" +
                                        "Current balance: R$" + balance + "\n" + "CPF: " + cpf, "Account: " + name,
                                        JOptionPane.DEFAULT_OPTION);
    }

    public static void showMoves(ArrayList<String> moves, String name){
        String[] totalMenu = new String[moves.size()];

        for(int x=0; x<moves.size();x++){
            totalMenu[x] = moves.get(x) + "\n";
        }

        JOptionPane.showMessageDialog(null, totalMenu, "Account: " + name, JOptionPane.DEFAULT_OPTION);
    }


}
