package com.day6PracticeProblem;
import java.util.*;

public class JavaDay6Problems {
    public static void main(String[] args) {
        JavaDay6Problems methodCaller = new JavaDay6Problems();
        methodCaller.reverseNumber();
    }
    public void reverseNumber() {
        Scanner reverseNumberInput = new Scanner(System.in);
        System.out.println("Please enter an Integer number to reverse.");
        int userInput =  reverseNumberInput.nextInt();
        int reversedNumber = 0;
        while (userInput != 0) {
            int lastDigit = userInput % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            userInput = userInput / 10;
        }
        System.out.println("The reversed number is " + reversedNumber);
    }
}
