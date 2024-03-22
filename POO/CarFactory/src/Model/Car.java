package Model;

import java.util.ArrayList;

public class Car {
    private ArrayList<String> model = new ArrayList<>();
    private ArrayList<String> color = new ArrayList<>();

    public ArrayList<String> getModel() {
        return model;
    }

    public void setModel(String models) {
        this.model.add(models);
    }

    public ArrayList<String> getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color.add(color);
    }

    public void RemoveCar(int index){
        model.remove(index);
        color.remove(index);
    }

    public static String GetInfoCars(ArrayList getModels, ArrayList getColors){
        String infos = "";

        for(int x=0;x<getModels.size();x++)
        {
            infos+= (x+1) + " Model.Car\n\n" +
                    "Model: " + getModels.get(x) + "\n" +
                    "Color: " + getColors.get(x) + "\n\n";
        }
        return infos;
    }
}
