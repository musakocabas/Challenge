package com.mek;

public class TeenNumberChecker {
    public static boolean isTeen(int value){
        return value>=13 && value <= 19;
    }
    public static boolean hasTeen(int n1,int n2,int n3){
        return isTeen(n1)||isTeen(n2)||isTeen(n3);
    }

}
