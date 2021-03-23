package com.mek;

public class Main {

    public static void main(String[] a) {
       /* Digits d = new Digits();
        byte digits[][][] = {d.m,d.u,d.s};
        int wreps = 1;
        int hreps = 1;
        format(digits,wreps,hreps);*/

     //   System.out.println(MethodOverloading.calcFeetAndInchesToCentimeters(157));

        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        MinutesToYearsDaysCalculator.printYearsAndDays(-561600);





        /*System.out.print("[");
        for (String s: a){
            System.out.println(s+",");
        }
        System.out.println("\b]");*/

        /*LeapYear ly= new LeapYear();
        System.out.println(ly.isLeapYear(1700));*/

       /* SpeedConverter sc = new SpeedConverter();
        sc.printConversion(1.25);
        sc.printConversion(10.25);
        sc.printConversion(-5.6);
        sc.printConversion(75.114);*/
       /* MegaBytesConverter mb = new MegaBytesConverter();
        mb.printMegaBytesAndKiloBytes(-5000); *

        */
      /*  BarkingDog bd = new BarkingDog();
        System.out.println(bd.shouldWakeUp(true,1));
        System.out.println(bd.shouldWakeUp(false,2));
        System.out.println(bd.shouldWakeUp(true,8));
        System.out.println(bd.shouldWakeUp(true,-1));*/

    }//main
  /*  public static void format(byte[][][] digits,int wreps,int hreps){
        for (int line = 0;line < 8 ;line ++){
            for (int rep = 0;rep < hreps ;rep ++){
                for (int digit = 0;digit < digits.length ;digit++){
                    for(int i =0;i<8;i++){
                        if(digits[digit][line][i]==0){
                            for(int w =0;w<wreps;w++) {System.out.print("    ");}
                        }else
                            for (int w = 0;w<wreps;w++){
                                System.out.print("musa");
                            }
                    }
                }
            }
            System.out.println();
        }

    }*/
}
