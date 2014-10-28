////////////////////////////////////////////////////////////////////////////////
//Chase Menna
//CSE2
//lab 4
//9-17-14
//Big mac again
/* essentially asks how many big macs are wanted and whether or not they want fries
while spitting out the total cost */

//normal stuff
import java.util.Scanner;
public class BigMacAgain {
    
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myscanner;
        myscanner= new Scanner (System.in);
        
        //Constants
        double bmcost= 2.22;
        double frcost= 2.15;
        
        //Input:
        //bigmacs
        
        
        
        System.out.println("How many Big Macs do you want? ");
        if (myscanner.hasNextInt()) {
        int bigmacs= myscanner.nextInt();
        
        double cost10= bigmacs*bmcost;
        int cost00=(int)(cost10*100);
        double cost1= cost00/100;
        double cost= cost1+.10;
        
        //output
        System.out.println("You ordered " +bigmacs+ " BigMacs for a cost of: $" 
        +cost);
        
       
        
        //fries
        System.out.println("Would you like fries with that? (Y/y/N/n) ");
        
        
        
            if (myscanner.hasNext()) {
            String ans= myscanner.next();
            
                if (ans.equals("Y")) {
            System.out.println("You ordered fries at a cost of $2.15");
            System.out.println("The total cost of the meal is: $" +(cost+2.15));
            }
            
                else if (ans.equals("y")) {
            System.out.println("You ordered fries at a cost of $2.15");
            System.out.println("The total cost of the meal is: $" +(cost+2.15));
            }
            
                else if (ans.equals("N")) {
            System.out.println("You did not order fries with that.");
            System.out.println("The total cost of the meal is: $" +cost);
            }
            
                else if (ans.equals("n")) {
            System.out.println("You did not order fries with that.");
            System.out.println("The total cost of the meal is: $" +cost);
            }
            }
            else{
            System.out.println("you did not enter Y/y/N/n");
            return;
            }
        }    
        else{
                System.out.println("You did not enter an int");
                return;
            }
        
    }
}