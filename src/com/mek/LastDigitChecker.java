package com.mek;

public class LastDigitChecker {
    public static boolean isValid(int x) { return x>=10 && x <=1000;}
    public static boolean hasSameLastDigit(int n1,int n2, int n3){
        return (isValid(n1) && isValid(n2) && isValid(n3)) && (n1%10 == n2%10 || n1%10 == n3%10 || n2%10 == n3%10 );
    }
}
