package View;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class InputOutput {

    public static int indexMenuZero(){
        String[] options = {"Create a new car","Exit"};
        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, "Select the option!", JOptionPane.DEFAULT_OPTION);

        return menu.getSelectedIndex();
    }
    public static int indexMenu(){
        String[] options = {"Create a new car","List of factory cars","Sell car","Exit"};
        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, "Select the option!", JOptionPane.DEFAULT_OPTION);

        return menu.getSelectedIndex();
    }

    public static int amountCars(){
        return Integer.parseInt(JOptionPane.showInputDialog("How many cars do you need to create?"));
    }
    public static String modelMenu(int count){
        return JOptionPane.showInputDialog("Insert the name of "  + (count+1) + " model car!");
    }

    public static String colorMenu(int count){
        return JOptionPane.showInputDialog("Insert the name of "  + (count+1) + " color car!");
    }

    public static void ShowListCars(String infos){
        JOptionPane.showMessageDialog(null, infos, "Cars models", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int MenuSellCars(ArrayList getModels){
        String[] options = new String[getModels.size()];

        for(int x=0;x<getModels.size();x++)
        {
            options[x] = getModels.get(x).toString();
        }

        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, "Select the option!", JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null,"The car was successful sell!");

        return menu.getSelectedIndex();
    }

}
