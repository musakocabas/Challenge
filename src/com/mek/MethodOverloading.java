package com.mek;

public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        return (feet>=0 && (inches>=0 && inches <=12)) ? ((feet*12)+inches)*2.54 : -1 ;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        return (inches>=0) ? calcFeetAndInchesToCentimeters((int)inches/12,(int)inches%12) : -1;
    }


}
