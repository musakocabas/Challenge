package com.mek;

public class Main {

    public static void main(String[] args) {

       /* SpeedConverter sc = new SpeedConverter();
        sc.printConversion(1.25);
        sc.printConversion(10.25);
        sc.printConversion(-5.6);
        sc.printConversion(75.114);*/
       /* MegaBytesConverter mb = new MegaBytesConverter();
        mb.printMegaBytesAndKiloBytes(-5000); *

        */
        BarkingDog bd = new BarkingDog();
        System.out.println(bd.shouldWakeUp(true,1));
        System.out.println(bd.shouldWakeUp(false,2));
        System.out.println(bd.shouldWakeUp(true,8));
        System.out.println(bd.shouldWakeUp(true,-1));

    }
}
