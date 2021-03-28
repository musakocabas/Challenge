package com.mek;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int sum =0;
        int num = number;
        while (num !=0){
            int lastDigit = num%10;
            if(lastDigit%2==0) sum+=lastDigit;
            num/=10;
            System.out.println(lastDigit);
        }


        return (number>=0) ? sum : -1;
    }
}
