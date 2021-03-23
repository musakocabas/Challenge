package com.mek;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0) System.out.println("Invalid Value");
        else{
            int years = (int)minutes / (60 * 24 * 365);
            int yearsRemaining = (int)minutes % (60 * 24 * 365);
            long days = yearsRemaining / (60 * 24);
            System.out.println(minutes + " min = "+years+" y and "+days+" d");
        }
    }
}
