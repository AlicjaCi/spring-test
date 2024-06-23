package com.example.demo;

public class LoanCalculator {


    public static double calculateFixedInstallment(double kwotakredytu, double oprocentowanie, int liczbaRat) {
        double q = 1 + (oprocentowanie / 12);
        return (kwotakredytu * oprocentowanie) / (12 * (1 - Math.pow(q, liczbaRat)));
    }
}
