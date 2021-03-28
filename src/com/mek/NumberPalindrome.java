package com.mek;

public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        number = Math.abs(number);
        int number2 = number;
        int reverse = 0;

        while (number2 > 0) {
            reverse = (number2 % 10) + (reverse * 10);
            number2 /= 10;
        }
        return number == reverse;
    }
}
