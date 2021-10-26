package com.day6PracticeProblem;
import java.util.*;

public class JavaDay6Problems {
    public static void main(String[] args) {
        JavaDay6Problems methodCaller = new JavaDay6Problems();
        methodCaller.fibonacciSeries();
    }
    public void fibonacciSeries() {
        Scanner fibonacciLengthInput = new Scanner(System.in);
        System.out.println("Please enter the length of Fibonacci Series want to print for.");
        int fibonacciInput =  fibonacciLengthInput.nextInt();
        int number01 = 0;
        int number02 = 1;
        System.out.print(number01 + " + " + number02 + " + ");
        for(int i=0;i < fibonacciInput-2;i++){
            int number03 = number01 + number02;
            System.out.print(" + "+number03);
            number01 = number02;
            number02 =  number03;
        }

    }
}
