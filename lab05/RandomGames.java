////////////////////////////////////////////////////////////////////////////////
/* Chase Menna
    CSE2
    RandomGames.java
    9-24-14
    */
    
import java.util.Scanner;
public class RandomGames {
    
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myscanner= new Scanner (System.in);
        
        //Display
        System.out.println("What game would you like to play?");
        System.out.println("Roulette: R/r, Craps: C/c, Pick a Card: P/p");
        String game= (myscanner.next());
        
        //Switch
        
        switch (game){
            case "r": 
                System.out.println("You chose Roulette.");
            
                int roll= (int)(Math.random()*37);
                switch (roll){
                    case 0:
                        if (roll==0)
                            System.out.println("00: JACKPOT!");
                        
                    default:
                        if (roll !=0)
                            System.out.println(roll+ ": Sorry, try again");
                }
            break;
            
            case "R":
                System.out.println("You chose Roulette.");
                
                roll= (int)(Math.random()*37);
                switch (roll){
                    case 0:
                        if (roll==0)
                            System.out.println("00: JACKPOT!");
                        
                    default:
                        if (roll !=0)
                            System.out.println(roll+ ": Sorry, try again");
                }    
            break;
            //end of roulette 
            
            
            case "c":
                System.out.println("You chose Craps.");
                
                int die= (int)(1+(Math.random()*6));
                int die2= (int)(1+(Math.random()*6));
                
                int total= die+die2;
                
                System.out.println("You rolled: "+die+ " and "+die2+" for: "+total);
                    
            break;
            
            case "C":
                System.out.println("You chose Craps.");
                
                die= (int)(1+(Math.random()*6));
                die2= (int)(1+(Math.random()*6));
                
                total= die+die2;
                
                System.out.println("You rolled: "+die+ " and "+die2+" for: "+total);
                
            break;
            // end of craps
            
            
            case "p": 
                System.out.println("You chose Pick a card.");
                //number
                int number=(int)(1+(Math.random()*13));
                    
                    switch (number) {
                        case 1:
                            number=(String)"ace";
                        break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            
                    }
                    
                //suit
                int suit= (int)(1+(Math.random()*4));
                    
                    String soot= "";
                    
                    switch (suit) {
                        case 1:
                                soot= "of hearts";
                        break;
                        
                        case 2:
                                soot= "of clubs";
                        break;
                        
                        case 3:
                                soot= "of spades";
                        break;
                        
                        case 4:
                                soot= "of diamonds";
                        break;
                    }
                System.out.println(+number+" " +soot);
                
            break;
            
            case "P":
                System.out.println("You chose Pick a card.");
                //number
                number=(int)(1+(Math.random()*13));
                    
                //suit
                suit= (int)(1+(Math.random()*4));
                    
                    soot="";
                    
                    switch (suit) {
                        case 1:
                                soot= "of hearts";
                        break;
                        
                        case 2:
                                soot= "of clubs";
                        break;
                        
                        case 3:
                                soot= "of spades";
                        break;
                        
                        case 4:
                                soot= "of diamonds";
                        break;
                    }
                System.out.println(+number+" " +soot);  
                
            break;
            
            default: 
                System.out.println("You did not pick (R/r/C/c/P/p)");
                return;
            
            
        }
    }
}