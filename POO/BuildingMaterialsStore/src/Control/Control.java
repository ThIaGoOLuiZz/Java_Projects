package Control;

import Model.Coupons;
import Model.DataProducts;
import Model.Product;
import Model.Storage;
import View.InputOutput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Control {
    Storage storage = new Storage();
    DataProducts dataProducts = new DataProducts();
    int selectedOption;
    int index;
    int amount;
    int newAmount;
    int currentAmount;

    public void showMenu(){

        do {
            if(dataProducts.getProducts().size()==0){
                InputOutput.showEmptyStorageMessage();
                selectedOption = InputOutput.showMenuZero();
            }
            else{
                selectedOption = InputOutput.showMenu();
            }

            switch (selectedOption){
                case 0: // CREATE PRODUCT
                    Product product = new Product();
                    product.setCode(InputOutput.getCodeMenu());
                    product.setDescription(InputOutput.getDescriptionMenu());
                    product.setPrice(InputOutput.getPriceMenu());
                    dataProducts.setProducts(product);
                    break;

                case 1: // SHOW REGISTERED PRODUCT
                    if(dataProducts.getProducts().size() == 0){
                        System.exit(0);
                    }
                    index = InputOutput.selectIndex(dataProducts.getProducts());
                    if(index != dataProducts.getProducts().size()){
                        InputOutput.showRegisteredItensMenu(dataProducts.getProducts(), index);
                    }
                    break;

                case 2: // REGISTER PRODUCT ON STORAGE
                    InputOutput.showRegisterStorageMessage();
                    index = InputOutput.selectIndex(dataProducts.getProducts());
                    if(index != dataProducts.getProducts().size()){
                        dataProducts.getProducts().get(index).setAmount(InputOutput.setAmount());
                        storage.setProducts(dataProducts.getProducts().get(index));
                        InputOutput.showRegisterSucessfulMessage();
                    }
                    break;

                case 3: // SHOW PRODUCT IN STORAGE
                    if (storage.getProducts().size() == 0){
                        InputOutput.showEmptyStorageMessage();
                    }
                    else{
                        index = InputOutput.selectIndex(storage.getProducts());
                        if(index != dataProducts.getProducts().size()){
                            InputOutput.showStockItensMenu(storage.getProducts(), index);
                        }
                    }

                    break;

                case 4: // SELL PRODUCT ON STORAGE
                    if (storage.getProducts().size() == 0){
                        InputOutput.showEmptyStorageMessage();
                    }
                    else {
                        index = InputOutput.selectIndex(storage.getProducts());
                        if(index != dataProducts.getProducts().size()){
                            amount = InputOutput.selectAmountSells(storage.getProducts().get(index).getAmount());
                            currentAmount = storage.getProducts().get(index).getAmount();
                            newAmount = InputOutput.sellProducts(amount, currentAmount);

                            if(amount > currentAmount){
                                InputOutput.sellErrorMessage(currentAmount);
                            }
                            else if(amount == currentAmount){
                                Coupons coupon = new Coupons();
                                coupon.setCode(storage.getProducts().get(index).getCode());
                                coupon.setDate("Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                                coupon.setAmountSelled(amount);
                                coupon.setTotalPrice(amount * storage.getProducts().get(index).getPrice());
                                storage.getProducts().get(index).setCoupons(coupon);
                                storage.setAllCoupons(coupon);

                                storage.getProducts().remove(index);
                                InputOutput.sucessfullySell(newAmount);
                            }
                            else{
                                Coupons coupon = new Coupons();
                                coupon.setCode(storage.getProducts().get(index).getCode());
                                coupon.setDate("Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                                coupon.setAmountSelled(amount);
                                coupon.setTotalPrice(amount * storage.getProducts().get(index).getPrice());
                                storage.getProducts().get(index).setCoupons(coupon);
                                storage.setAllCoupons(coupon);

                                storage.getProducts().get(index).setAmount(newAmount);
                                InputOutput.sucessfullySell(newAmount);
                            }
                        }
                    }
                    break;
                case 5: // SHOW ALL COUPONS
                    InputOutput.showAllCoupons(storage.getAllCoupons());
                    break;

                case 6: // SHOW COUPONS PER PRODUCT
                    if (storage.getProducts().size() == 0){
                        InputOutput.showEmptyStorageMessage();
                    }
                    else{
                        index = InputOutput.selectIndex(storage.getProducts());
                        if(index != dataProducts.getProducts().size()){
                            InputOutput.showProductCoupons(storage.getProducts().get(index).getCoupons());
                        }
                    }
                    break;

                case 7: // CALCULATE ALL COUPONS VALUE
                    InputOutput.calculateAllCoupons(storage.getAllCoupons());
                    break;

                case 8:
                    System.exit(0);
            }
        }while (true);
    }
}
