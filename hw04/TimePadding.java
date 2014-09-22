////////////////////////////////////////////////////////////////////////////////
/* Chase Menna
    CSE2
    TimePadding.java
    9-22-14
    hw04
    */

import java.util.Scanner;    
public class TimePadding {
    
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myscanner= new Scanner (System.in);
        
        //Display:
        System.out.println("Enter time in seconds: ");
        int seconds= myscanner.nextInt();
        
        //if seconds is bad int:
        if (seconds>0) {
            seconds=seconds;
        }
         else if (seconds<0) {
             System.out.println("Seconds must be > 0");
             return;
         }
         else {
             System.out.println("Seconds must be an int");
             return;
         }
         
         //Calculations
         int hours= (int)(seconds/3600);
         int minutes= (int)((seconds%3600)/60);     
         int secs= (int)(seconds%60);
         
         //padding
         
         if (((hours<10)&&(minutes<10)&&(secs<10))==true) {
             System.out.println("The time is: " +0+ hours+":" +0+ +minutes+ ":" +0+ +secs);
         }
         else if (((hours<10)&&(minutes<10)&&(secs>9))==true) {
             System.out.println("The time is: "+0+ +hours+":"+0+ +minutes+":"+secs);
         }
         else if(((hours<10)&&(minutes>9)&&(secs>9))==true) {
             System.out.println("The time is: " +0+ +hours+":"+minutes+":"+secs);
         }
         else if (((hours>9)&&(minutes<10)&&(secs<10))==true) {
             System.out.println("The time is: "+hours+":" +0+ +minutes+":"+0+ +secs);
         }
         else if (((hours>9)&&(minutes>9)&&(secs<10))==true) {
             System.out.println("The time is: "+hours+":"+minutes+":" +0+ +secs);
         }
         else if (((hours>9)&&(minutes>9)&&(secs>9))==true) {
             System.out.println("The time is: "+hours+":"+minutes+":"+secs);
         }
         else if (((hours>9)&&(minutes<10)&&(secs>9))==true) {
             System.out.println("The time is: "+hours+":"+0+ +minutes+":"+secs);
         }
         else if (((hours<10)&&(minutes>9)&&(secs<10))==true) {
             System.out.println("The time is: "+0+ +hours+":"+minutes+":" +0+ +secs);
         }
         
    }
}