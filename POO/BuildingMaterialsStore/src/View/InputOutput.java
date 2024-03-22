package View;

import Model.Coupons;
import Model.Product;

import javax.swing.*;
import java.util.ArrayList;

public class InputOutput {

    public static int showMenuZero() {
        String[] options = {"Register a new product", "Exit"};

        JComboBox menu = new JComboBox(options);
        JOptionPane.showConfirmDialog(null, menu, "Select a option", JOptionPane.DEFAULT_OPTION);
        return menu.getSelectedIndex();
    }

    public static int showMenu() {
        String[] options = {"Register a new product", "Show registered products", "Register product on storage"
                , "Show products in storage", "Sell product", "Show all coupons", "Show coupons per product",
                "Calculate all coupons values", "Exit"};

        JComboBox menu = new JComboBox(options);
        JOptionPane.showConfirmDialog(null, menu, "Select a option", JOptionPane.DEFAULT_OPTION);
        return menu.getSelectedIndex();
    }


    public static void showEmptyStorageMessage() {
        JOptionPane.showMessageDialog(null, "You don't have any products on storage, you must register!",
                "Alert", JOptionPane.ERROR_MESSAGE);
    }

    public static String getCodeMenu() {
        return JOptionPane.showInputDialog(null, "What's the code of the product?",
                "Code register", JOptionPane.DEFAULT_OPTION);
    }

    public static String getDescriptionMenu() {
        return JOptionPane.showInputDialog(null, "Describe the product:",
                "Description register", JOptionPane.DEFAULT_OPTION);
    }

    public static double getPriceMenu() {
        double count;
        do{
            count = Double.parseDouble(JOptionPane.showInputDialog(null, "What's the price of the product:","Description register", JOptionPane.DEFAULT_OPTION));
            if(count <= 0.0){
                JOptionPane.showMessageDialog(null, "You need to register a valid number!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (count <= 0.0);
        return count;
    }

    public static void showRegisteredItensMenu(ArrayList<Product> products, int index) {
        String desc = "Code: " + products.get(index).getCode() + "\n" +
                "Description: " + products.get(index).getDescription() + "\n" +
                "Price: " + products.get(index).getPrice();

        JOptionPane.showMessageDialog(null, desc, "Full Description Model.Product",
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int selectIndex(ArrayList<Product> products) {
        String[] items = new String[products.size()+1];

        for (int x = 0; x < products.size()+1; x++) {
            try{
                items[x] = "Code: " + products.get(x).getCode();
            }
            catch (IndexOutOfBoundsException e){
                items[x] = "Return";
            }

        }

        JComboBox menu = new JComboBox<>(items);

        JOptionPane.showMessageDialog(null, menu, "Codes list", JOptionPane.PLAIN_MESSAGE);

        return menu.getSelectedIndex();
    }

    public static int setAmount(){
        int count;
        do{
            count = Integer.parseInt(JOptionPane.showInputDialog(null, "How many itens will you register?","Register product", JOptionPane.PLAIN_MESSAGE));
            if(count <=0){
                JOptionPane.showMessageDialog(null, "You need to register a valid number!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (count <= 0);
        return count;
    }

    public static void showRegisterStorageMessage(){
        JOptionPane.showMessageDialog(null,"Select the iten where you want to register on Model.Storage.","Register a product on Model.Storage", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showRegisterSucessfulMessage(){
        JOptionPane.showMessageDialog(null,"The product has been registered successfully.","Register a product on Model.Storage", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showStockItensMenu(ArrayList<Product> products, int index) {
        String desc = "Code: " + products.get(index).getCode() + "\n" +
                "Description: " + products.get(index).getDescription() + "\n" +
                "Price: " + products.get(index).getPrice() + "\n" +
                "Amount Stocked: " + products.get(index).getAmount();

        JOptionPane.showMessageDialog(null, desc, "Full Description Model.Product",
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int selectAmountSells(int totalAmount){
        int amount;
        do{
            amount = Integer.parseInt(JOptionPane.showInputDialog(null, "What's the amount of selled products?\n Current Amount in the Storage: " + totalAmount
                    , "Sell product", JOptionPane.PLAIN_MESSAGE));
            if (amount<=0){
                JOptionPane.showMessageDialog(null, "You need to register a valid number!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (amount<=0);
        return amount;
    }

    public static void showAllCoupons(ArrayList<Coupons> allCoupons){
        String message = "";

        for(int x=0; x<allCoupons.size(); x++){
            message += "Code: " + allCoupons.get(x).getCode() + "\n" +
                       "Sell data: " + allCoupons.get(x).getDate() + "\n" +
                       "Amount Selled: " + allCoupons.get(x).getAmountSelled() + "\n" +
                       "Total price: " + allCoupons.get(x).getTotalPrice() + "\n\n";

        }

        JOptionPane.showMessageDialog(null, message,"All coupons", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showProductCoupons(ArrayList<Coupons> coupons){
        String message = "";

        for(int x=0; x<coupons.size();x++){
            message += "Code: " + coupons.get(x).getCode() + "\n" +
                    "Sell data: " + coupons.get(x).getDate() + "\n" +
                    "Amount Selled: " + coupons.get(x).getAmountSelled() + "\n" +
                    "Total price: " + coupons.get(x).getTotalPrice() + "\n\n";
        }

        JOptionPane.showMessageDialog(null, message,"All coupons", JOptionPane.PLAIN_MESSAGE);
    }

    public static void calculateAllCoupons(ArrayList<Coupons> allCoupons){
        double sum = 0.0;

        for(int x=0; x<allCoupons.size(); x++){
            sum += allCoupons.get(x).getTotalPrice();

        }

        JOptionPane.showMessageDialog(null, ("Total value: " + sum),"All coupons", JOptionPane.PLAIN_MESSAGE);
    }

    public static int sellProducts(int amount, int currentAmount){
        return currentAmount - amount;
    }

    public static void sellErrorMessage(int amount){
        JOptionPane.showMessageDialog(null, "You can't do it! Your amount is lower than the requisition!\n\n\tCurrent amount: " + amount, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public static void sucessfullySell(int currentAmount){
        JOptionPane.showMessageDialog(null, "Sucessful! Your new amount: " + currentAmount, "Sucessful", JOptionPane.PLAIN_MESSAGE);
    }
}
