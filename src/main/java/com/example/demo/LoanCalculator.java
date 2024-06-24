package com.example.demo;

public class LoanCalculator {


    public static double calculateFixedInstallment(double loanAmount, double oprocentowanie, int liczbaRat) {
        double interestPerMonth = 1 + (oprocentowanie / 12);
        return (loanAmount * oprocentowanie) / (12 * (1 - Math.pow(interestPerMonth, -liczbaRat)));
    }
}
