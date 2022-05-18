package com.pms.detail.util;

public class CommonUtils {
    public static double calculateBankCharge(String bankType) {
        double bankServiceCharge = 0;
        if (bankType.equalsIgnoreCase("private")) {
            bankServiceCharge = 550;
        } else {
            bankServiceCharge = 500;
        }
        return bankServiceCharge ;
    }
}
