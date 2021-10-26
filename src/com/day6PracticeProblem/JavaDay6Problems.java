package com.day6PracticeProblem;
import java.util.*;

public class JavaDay6Problems {
    int flag;
    public static void main(String[] args) {
        JavaDay6Problems methodCaller = new JavaDay6Problems();
        methodCaller.fibonacciSeries();
    }
    public void fibonacciSeries() {
        Scanner fibonacciLengthInput = new Scanner(System.in);
        System.out.println("Please enter the length of Fibonacci Series want to print for.");
        int primeInput =  fibonacciLengthInput.nextInt();
        for (int i = 3; i < primeInput; i++) {
            if (primeInput % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Not Prime number");
        } else
            System.out.println("Prime");
    }
}
