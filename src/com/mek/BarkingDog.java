package com.mek;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){
        return isBarking && ((hourOfDay>=0 && hourOfDay<8) || hourOfDay == 23);
    }
}
