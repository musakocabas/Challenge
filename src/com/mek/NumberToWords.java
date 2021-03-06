package com.mek;

public class NumberToWords {
    public static int getDigitCount(int number){ return (number<0) ? -1 : (""+number).length();}

    public static int reverse(int number){
        StringBuilder strNumber = new StringBuilder(""+((number<0) ? number*-1 : number));
        int revNumber = Integer.parseInt(strNumber.reverse().toString());
        return (number<0) ? revNumber*-1 : revNumber;
    }
    public static void numberToWords(int number){
        if(number<0){ System.out.println("Invalid Value");return;}
        int revNumber = reverse(number);
        String[] Words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i=0;i<getDigitCount(number);i++){
            System.out.print(Words[revNumber%10] + " ");
            revNumber/=10;
        }
    }
}