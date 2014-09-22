////////////////////////////////////////////////////////////////////////////////
/* Chase Menna
    CSE2
    IncomeTax.java
    9-21-14
    hw04
    */

import java.util.Scanner;    
public class IncomeTax {
    
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myscanner= new Scanner (System.in);
        
        //Display:
        System.out.println("What is the income? (in thousands)");
        int integ= myscanner.nextInt();
        
        int income=integ*1000;
        
        if (income>=0){
            income=income;
        }
        else if (income<0){
           System.out.println("Income must be >0");
            return;
        }
        else {
          System.out.println("You did not enter an int");
            return;
        } 
        
        //Tax % breakup
        double taxpercent=0; //easier to work with??
        
        if (income<20000) {
            double tax= taxpercent + .05;
            double total= income*tax;
            //Output
            System.out.println("The tax of $" +income+ "is $" +total);
        }
        
        else if ((20000<=income) && (income<40000)==true) {
            double tax= taxpercent + .07;
            double total=(1000)+(tax*(income-20000));
            //Output
            System.out.println("The tax of $" +income+ "is $" +total);
        }
        
        else if ((40000<=income) && (income<78000)== true) {
            double tax= taxpercent + .12;  
            double total= (2400)+ (tax*(income-40000));
            //Output
            System.out.println("The tax of $" +income+ "is $" +total);
        }
        
        else if (income>=78000){
            double tax= taxpercent + .14;
            double total= (11760)+ (tax*(income-78000));
            //Output
            System.out.println("The tax of $" +income+ " is $" +total);
        }
    }
}