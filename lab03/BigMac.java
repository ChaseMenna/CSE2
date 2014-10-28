////////////////////////////////////////////////////////////////////////////////
//Chase Menna
//lab 03
//CSE2
//9-10-14

//Scanner line
import java.util.Scanner;
//class
public class BigMac {
    
    //main method
    public static void main(String[] args) {
        
        //scanner setup
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //input number of big macs and record input
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        
        //Input cost of big macs and save input
        System.out.print("What is the cost of Big Macs+a double(in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        
        //input tax percent and record it
        System.out.print("Enter the percent tax as a whole number(xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; // takes tax rate (7) and becomes .07
        
        double cost$; //name total price
        
        //Calculations
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        
        //conversions
        int dollars=(int)(cost$);
        int dimes=(int)(cost$*10)%10;
        int pennies=(int)(cost$*100)%10;
        
        
        
        //Output
        
        System.out.println("The total cost of " +nBigMacs+ " BigMacs, at $"
        +bigMac$+ " per bigMac, with a sales tax of " +(int)(taxRate*100)+
        "%, is $" + dollars+"."+dimes+pennies);
        

    }
}
