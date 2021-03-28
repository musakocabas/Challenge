package com.mek;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        String strNumber = ""+number;
        String firstDigit = strNumber.substring(0,1);
        String lastDigit = strNumber.substring(strNumber.length()-1);
        return (number>=0) ? Integer.parseInt(firstDigit)+Integer.parseInt(lastDigit):-1;
    }
}
