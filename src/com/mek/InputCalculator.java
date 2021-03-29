package com.mek;


import java.util.Scanner;

public class InputCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }

}
