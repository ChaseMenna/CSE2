/* Chase Menna
    CSE2
    10-8-14
    LoopTheLoop.java
    */

import java.util.Scanner;
public class LoopTheLoop {
    
    public static void main(String[] args) {
        
        Scanner myscanner= new Scanner(System.in);
        
        int nStars=10;
        int stars=0;
        String sterr="*";
        
        System.out.println("Loop 3:");
        System.out.println("Enter an int 1-15.");
        
        if (myscanner.hasNextInt()) {
            if ((nStars<1) || (nStars>15)) {
            System.out.println("Enter number between 1 and 15");
            return;
            }
            else {
                while (stars<nStars) {
                    System.out.print(sterr);
                    stars++;
                }
            }
        }
        else {
            System.out.println("You did not enter an int");
            return;
        }
        
        
        /*System.out.println("Loop 1:");
        while (stars<nStars) {
            System.out.print(sterr);
            stars++;
        }
        System.out.println(" ");
        
        //end of first
        int the=0;
        String many="*";
        
        System.out.println("Loop 2:");
        while (stars<nStars) {
            System.out.println(sterr);
            stars++;
            
            while (the<stars) {
                System.out.print(many);
                the++;
                
            }

        }
        */
    }
}