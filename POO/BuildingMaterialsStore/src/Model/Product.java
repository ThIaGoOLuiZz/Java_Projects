package Model;

import Model.Coupons;

import java.util.ArrayList;

public class Product {
    private String code;
    private String description;
    private double price;
    private int amount;
    private ArrayList<Coupons> coupons = new ArrayList<>();

    public ArrayList<Coupons> getCoupons() {
        return coupons;
    }

    public void setCoupons(Coupons coupons) {
        this.coupons.add(coupons);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
