package com.mek;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int sumDivisor =0;
        for (int i =1;i<number;i++){
            if(number%i==0) {
                sumDivisor+=i;

            }
        }
        return number>0 && sumDivisor == number;
    }
}
