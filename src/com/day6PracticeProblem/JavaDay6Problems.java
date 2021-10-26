package com.day6PracticeProblem;

import java.util.*;

public class JavaDay6Problems {

    Scanner stopwatchInput = new Scanner(System.in);
    double startTime, stopTime;

    public static void main(String[] args) {
        JavaDay6Problems methodCaller = new JavaDay6Problems();
        methodCaller.swSimulator();
    }

    public void swSimulator() {
        JavaDay6Problems commonObject = new JavaDay6Problems();
        commonObject.startMethod();
        commonObject.stopMethod();
        commonObject.printMethod();
    }

    private void startMethod() {
        System.out.println("Please Enter 1 to start the Stopwatch.");
        int start = stopwatchInput.nextInt();
        if (start == 1) {
            startTime = System.currentTimeMillis();
        } else {
            System.out.println("Invalid input please try again.");
            startMethod();
        }
    }

    private void stopMethod() {
        System.out.println("Please Enter 0 to stop the Stopwatch.");
        int stop = stopwatchInput.nextInt();
        if (stop == 0) {
            stopTime = System.currentTimeMillis();
        } else {
            System.out.println("Invalid input please try again.");
            stopMethod();
        }
    }

    private void printMethod() {
        double timeInSeconds = ((stopTime - startTime)/1000);
        System.out.println("Time in seconds is: " + timeInSeconds+" s");
    }
}

