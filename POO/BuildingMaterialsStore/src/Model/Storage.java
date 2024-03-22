package Model;

import Model.Coupons;
import Model.Product;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Coupons> allCoupons = new ArrayList<>();

    public ArrayList<Coupons> getAllCoupons() {
        return allCoupons;
    }

    public void setAllCoupons(Coupons allCoupons) {
        this.allCoupons.add(allCoupons);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products.add(products);
    }

}
