package com.mek;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int n1 ,int n2){
        int value=1;
        for(int i=1;i<=n1;i++){
            if (n1%i==0){
                for(int j=1;j<=n2;j++){
                    if(n2%j==0 && i==j) value = i;
                }
            }
        }


        return (n1<10 || n2<10) ? -1 : value;
    }
}
