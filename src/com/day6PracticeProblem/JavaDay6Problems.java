package com.day6PracticeProblem;
import java.util.*;

public class JavaDay6Problems{
     void checkPerfectNumber() {
         Scanner scanInput = new Scanner(System.in);
         System.out.println("Enter a number to check perfect number");
         int userInput = scanInput.nextInt();
        int divisorSum = 0;
        for (int i = 1; i < userInput; i++) {
            if (userInput % i == 0) {
                divisorSum = divisorSum + i;
            }
        }
        if (divisorSum == userInput) {
            System.out.println(userInput + " is a perfect number");
        } else
            System.out.println(userInput + " is not a perfect number");
    }

    public static void main(String[] args) {
        JavaDay6Problems methodCaller = new JavaDay6Problems();
        methodCaller.checkPerfectNumber();
    }
}
