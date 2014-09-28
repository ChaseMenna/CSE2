/*
Chase Menna
CSE2
9/28/14
BurgerKing.java
*/

import java.util.Scanner;
public class BurgerKing {
    
    public static void main(String[] args) {
        
        //Scanner Setup
        Scanner myscanner= new Scanner (System.in);
        
        //Display
        System.out.println("Enter letter to indicate choice of: ");
        System.out.println("Burger: B or b");
        System.out.println("Soda: S or s");
        System.out.println("Fries: F or f");
        
        String choice= myscanner.next();
        
        if (choice.length()>1) {
            System.out.println("Enter a single character");
            return;
        }
        
        //start switch
        switch (choice) {
            case ("B"): case ("b"):
                choice= "a burger";
                
                System.out.println("Enter A for all the fixin's");
                System.out.println("Enter C/c for cheese, or N/n for no fixin's");
                String fixins= myscanner.next();
                
                if (fixins.length()>1) {
                    System.out.println("Enter a single character");
                    return;
                }
                
                    switch (fixins) {
                        case ("C"): case ("c"):
                            fixins= "cheese";
                        break;
                        
                        case ("N"): case ("n"):
                            fixins= "no fixin's";
                        break;
                        
                        case ("A"): case ("a"):
                            fixins= "all the fixin's";
                        break;
                        
                        default:
                            System.out.println("Enter an appropriate choice");
                            return;
                    } //end of fixins switch
                
                
                //Output:
                System.out.println("You ordered "+choice+" with "+fixins);
            break;
            
            case ("S"): case ("s"):
                choice= "a soda";
                
                System.out.println("Pepsi:(P/p), Coke:(C/c), Mountain Dew(M/m): ");
                String soda= myscanner.next();
                
                if (soda.length()>1) {
                    System.out.println("Enter a single character");
                    return;
                }
                    
                    switch(soda) {
                        case ("P"): case ("p"):
                            soda="a Pepsi";
                        break;
                        
                        case ("C"): case ("c"):
                            soda = "a Coke";
                        break;
                        
                        case ("M"): case ("m"):
                            soda = "a Mountain Dew";
                        break;
                        
                        default:
                            System.out.println("Enter an appropriate choice");
                            return;
                    }// end of soda switch
                    
                //Output:
                System.out.println("You ordered "+soda);
            break;
            
            case ("F"): case ("f"):
                choice= "fries";
                
                System.out.println("Would you like small:(S/s) or large:(L/l)");
                String size= myscanner.next();
                
                if (size.length()>1) {
                    System.out.println("Enter a single character");
                    return;
                }
                
                    switch (size) {
                        case ("L"): case ("l"):
                            size= "large ";
                        break;
                        
                        case ("S"): case ("s"):
                            size= "small ";
                        break;
                        
                        default:
                            System.out.println("Enter an appropriate choice");
                            return;
                    }// end of size switch
                
                //Output:    
                System.out.println("You ordered a "+size + choice);
            break;
            
            default:
                System.out.println("You didn't enter (B/b/S/s/F/f)");
                return;
                
                
        }//end of choice switch
        
    }
}