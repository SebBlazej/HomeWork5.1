package app;

import model.TwoNumbers;
import model.TwoNumbersFactory;

import java.util.Locale;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Podaj pierwsza liczbe");
        firstNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj druga liczbe");
        secondNumber = scanner.nextDouble();
        scanner.nextLine();

        TwoNumbersFactory twoNumbersFactory = new TwoNumbersFactory();
        TwoNumbers twoNumbers = twoNumbersFactory.buildTwoNumbers(firstNumber, secondNumber);
        System.out.println(twoNumbers.getComparisionResultAsSentence());


    }

}
