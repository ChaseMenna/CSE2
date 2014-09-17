////////////////////////////////////////////////////////////////////////////////
//Chase Menna
//hw03
//CSE2
//9/16/2014

import java.util.Scanner;
public class Bicycle {
    
    public static void main(String[] args) {
        
        //scanner setup
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //constants
        double diamWheel=27;
        double pi=3.14159;
        double feetpermile=5280;
        double inperfoot=12;
        
        //input counts and seconds
        System.out.println("How many seconds?");
        int seconds=myScanner.nextInt();
        
        System.out.println("How many counts?");
        int counts=myScanner.nextInt();
        
        //Calculations
        double minutes=seconds/60;
        double hours=minutes/60;
        double miles10=counts*pi*diamWheel/inperfoot/feetpermile;
        
        
        //decimal conversions
        double miles=(int) (miles10*100);
        double miles00= miles/100;
        
        //calculation mph
        double mph10=miles10/hours;
        
        //conversion mph
        double mph=(int) (mph10*100);
        double mph00=mph/100;
        
        //output
        System.out.println("The distance traveled is: " +miles00+ " miles, and took "
        +minutes+ " minutes");
        System.out.println("The average speed is: " +mph00+ " mph");
        
    }
}