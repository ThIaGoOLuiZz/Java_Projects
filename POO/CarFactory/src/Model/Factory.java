package Model;

import View.InputOutput;

public class Factory {

    public void SellCar(Car cars){
        cars.RemoveCar(InputOutput.MenuSellCars(cars.getModel()));
    }

    public void CreateCar(Car cars){
        int amount = InputOutput.amountCars();

        for(int x=0; x< amount; x++)
        {
            cars.setModel(InputOutput.modelMenu(x));
            cars.setColor(InputOutput.colorMenu(x));
        }
    }
}
