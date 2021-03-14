package com.mek;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secodValue){
        return ((int)(firstValue*1000) == (int)(secodValue*1000)) ? true:false;
    }
}
