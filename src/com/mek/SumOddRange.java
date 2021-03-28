package com.mek;

public class SumOddRange {
    public static boolean isOdd(int number){
            return (number>0) && (number%2!=0);
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        for (int i=isOdd(start) ? start : start+1; i<=end; i+=2) sum+=i;
        return (start<0 || start>end ? -1 : sum);
    }
}
