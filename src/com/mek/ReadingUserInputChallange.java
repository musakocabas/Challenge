package com.mek;

import java.util.Scanner;

public class ReadingUserInputChallange {
    static Scanner sc = new Scanner(System.in);

    public static void input(){
        int counter =0;
        int sum =0;
        while (true){
            System.out.print("Enter number #" + (counter+1)+ ":");
            if(sc.hasNextInt()){
                sum += sc.nextInt();
                counter++;
                if(counter ==10) break;

            }else System.out.println("Invalid Value");
            sc.nextLine();
        }
        System.out.println("sum = " + sum);


    }


}
