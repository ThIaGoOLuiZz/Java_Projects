package CalculadoraV5;
public class Soma implements IOperacao {
    private double num1;
    private double num2;

    //Getter 1
    public double getNum1(){
        return this.num1;
    }
    //Setter 1
    public void setNum1(double num1){
        this.num1=num1;
    }

    //Getter 2
    public double getNum2(){
        return this.num2;
    }
    //Setter 2
    public void setNum2(double num2){
        this.num2=num2;
    }

    public double calcula() {
        return num1 + num2;
    }
}