package Model;

public class Coupons {
    private String code;
    private String date;
    private int amountSelled;
    private double totalPrice;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmountSelled() {
        return amountSelled;
    }

    public void setAmountSelled(int amountSelled) {
        this.amountSelled = amountSelled;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
