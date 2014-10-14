/* Chase Menna
    CSE2
    Root.java
    HW06
    10-13-14
    */

import java.util.Scanner;    
public class Root {
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myscanner= new Scanner(System.in);
        
        //constants
        boolean gooddata;
        double x=0;
        
        //Display
        System.out.println("Enter a double greater than 0.");
        gooddata=myscanner.hasNextDouble();
        
        if (gooddata) {
            x=myscanner.nextDouble();
            
            if (x>0) {
                
                //low/high
                double low=0;
                double high=1+x;
                
                while ((high-low) > (1+x)*0.00000001) {
                    double mid=(high+low)/2; 

                    if (Math.pow(mid,2) > x) { 
                        high=mid;
                    }
                    else {
                        low=mid;
                    }
                }
                 
                //output
                System.out.println("Root of "+x+" is: "+ (high+low)/2);
        
            }
            else {
                System.out.println("Double must be greater than 0.");
                return;
            }//if double is less than 0
        }
        
        else {
            System.out.println("Enter a Double.");
            return;
        }// if didnt enter a double
        
    }
}