package com.day6PracticeProblem;

import java.util.*;

public class JavaDay6Problems {
    String couponChar, blzCoupon;

    public static void main(String[] args) {
        JavaDay6Problems methodCaller = new JavaDay6Problems();
        methodCaller.couponGenerator(methodCaller);
    }

    public void couponGenerator(JavaDay6Problems methodCaller) {
        Scanner couponInput = new Scanner(System.in);
        System.out.println("Please enter number of coupons to generate: ");
        int numberOfCoupons = couponInput.nextInt();
        for (int i = 0; i < numberOfCoupons; i++) {
            methodCaller.randomCharGenerator();
            blzCoupon = ("BLZ"+couponChar+(i+10)+"XC");
            System.out.println("---"+blzCoupon+"---");
        }
    }

    public void randomCharGenerator(){
        int intToChar = (int) (5 * Math.random() + 1);
        switch (intToChar) {
            case 1:
                int numInCoupon = (int) (9 * Math.random() + 1);
                couponChar = ("A"+numInCoupon);
                break;
            case 2:
                numInCoupon = (int) (9 * Math.random() + 1);
                couponChar = ("B"+numInCoupon);
                break;
            case 3:
                numInCoupon = (int) (9 * Math.random() + 1);
                couponChar = ("C"+numInCoupon);
                break;
            case 4:
                numInCoupon = (int) (9 * Math.random() + 1);
                couponChar = ("D"+numInCoupon);
                break;
            default:
                numInCoupon = (int) (9 * Math.random() + 1);
                couponChar = ("E"+numInCoupon);
                break;
        }
    }
}
