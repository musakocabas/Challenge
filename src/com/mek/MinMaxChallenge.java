package com.mek;

import java.util.Scanner;

public class MinMaxChallenge {
    static Scanner sc = new Scanner(System.in);
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public static void findMinAndMax(){
        System.out.print("how many numbers :");
        int limit = (sc.hasNextInt()) ? sc.nextInt() : 0;
        sc.nextLine();
        int counter = 0;
        System.out.println(limit + " kadar sayı girin");
        while (counter < limit){
            if(sc.hasNextInt()){
                int value = sc.nextInt();
                min = (value<min) ? value : min;
                max = (value>max) ? value : max;
                counter++;
            }else System.out.println("Invalid Value");
            sc.nextLine();
        }
        System.out.println("min = " + min + " max = " + max);
    }

}
