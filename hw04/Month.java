////////////////////////////////////////////////////////////////////////////////
/* Chase Menna
    CSE2
    Month.java
    9-21-14
    hw04
    */

import java.util.Scanner;    
public class Month {
    
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myscanner= new Scanner (System.in);
        
        //Display:
        System.out.println("Enter int for Month (1-12) ");
        int month= myscanner.nextInt();
        
        //Determine month
        if (month==9) {
            System.out.println("The month has 30 days ");
        }
        else if (month==4) {
            System.out.println("The month has 30 days ");
        }
        else if (month==6) {
            System.out.println("The month has 30 days ");
        }
        else if (month==11) {
            System.out.println("The month has 30 days ");
        }// end of 30 days months
        
        else if (month==12) {
            System.out.println("The month has 31 days ");
        }
        else if (month==10) {
            System.out.println("The month has 31 days ");
        }
        else if (month==8) {
            System.out.println("The month has 31 days ");
        }
        else if (month==7) {
            System.out.println("The month has 31 days ");
        }
        else if (month==5) {
            System.out.println("The month has 31 days ");
        }
        else if (month==1) {
            System.out.println("The month has 31 days ");
        }
        else if (month==3) {
            System.out.println("The month has 31 days ");
        }// end of all months minus feb
        
        else if (month==2) { //february leap year or not
            System.out.println("Enter a year: ");
            int year= myscanner.nextInt();
            
            if (year % 4 == 0) {
                System.out.println("The month has 29 days ");
            }
            else {
                System.out.println("The month has 28 days ");
            }  
        } //end of all months 1-12
    
        else { // if entered doesnt fit bt 1-12
            System.out.println("You did not enter an int between 1-12");
            return;
            
        }// end of all inputs
    }
}