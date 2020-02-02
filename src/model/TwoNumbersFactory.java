package model;

public class TwoNumbersFactory {

    public TwoNumbersFactory(){

    }

    public TwoNumbers buildTwoNumbers(double firstNumber, double secondNumber){
        return new TwoNumbers(firstNumber, secondNumber);
    }
}
