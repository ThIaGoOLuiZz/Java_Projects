package Control;
import View.*;
import Model.*;

import View.InputOutput;

public class Control {
    Car cars = new Car();
    Factory factory = new Factory();
    public void Menu(){
        int option;
        int sizeList;

        do
        {
            sizeList = cars.getModel().size();

            if (sizeList==0)
            {
                option = InputOutput.indexMenuZero();
            }
            else
            {
                option = InputOutput.indexMenu();
            }


            switch (option)
            {
                case 0:
                    factory.CreateCar(cars);
                    break;

                case 1:
                    if(sizeList == 0)
                    {
                        System.exit(0);
                        break;
                    }
                    InputOutput.ShowListCars(cars.GetInfoCars(cars.getModel(), cars.getColor()));
                    break;
                case 2:
                    factory.SellCar(cars);
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);

    }


}
