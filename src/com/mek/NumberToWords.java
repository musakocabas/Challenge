package com.mek;

public class NumberToWords {
    public static int getDigitCount(int number){ return (number<0) ? -1 : (""+number).length();}

    public static int reverse(int number){
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        } return reverseNumber;
    }
    public static void numberToWords(int number){
        if(number<0){ System.out.println("Invalid Value");return;}
        int revNumber = reverse(number);
        String[] Words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i=0;i<getDigitCount(number);i++){
            int digit = revNumber%10;
            System.out.print(Words[digit] + " ");
            revNumber/=10;
        }
    }
}
