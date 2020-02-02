package model;

public class TwoNumbers {
    private double firstNumber;
    private double secondNumber;

    TwoNumbers(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String getComparisionResultAsSentence(){
        if(firstNumberIsGreaterThanSecond()) return "Suma liczb to - " + (firstNumber + secondNumber);
        else if(firstNumberIsSmallerThanSecond()) return "Iloczyn liczb to - " + (firstNumber*secondNumber);
        else if(numbersAreEqual()) return "Kwadratowa potęga liczby to - " + (firstNumber*secondNumber);
        else return "Wystąpił błąd w porównaniu - sprawdź wprowadzony liczby";
    }

    private boolean firstNumberIsGreaterThanSecond(){
        return firstNumber > secondNumber;
    }

    private boolean firstNumberIsSmallerThanSecond(){
        return firstNumber < secondNumber;
    }

    private boolean numbersAreEqual(){
        return firstNumber == secondNumber;
    }
}
