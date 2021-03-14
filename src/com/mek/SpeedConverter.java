package com.mek;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        return (kilometersPerHour<0) ? -1 : Math.round((kilometersPerHour / 1.609));
    }
    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour<0) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour+" km/h = "+Math.round(toMilesPerHour(kilometersPerHour))+" mi/h");
    }

}
