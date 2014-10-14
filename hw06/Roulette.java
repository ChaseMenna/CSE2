/* Chase Menna
    CSE2
    HW06 Roullette.java
    10/13/14
    */

public class Roulette {
    
    public static void main(String[] args) {
        
        
        //constants
        int cashonhand=100;
        int totalplays=1000;
        int play=0;
        int play100=0;
        
        //ways to win
        int wonsome=0;
        int wonnone=0;
        int lostsome=0;
        int totalwinnings=0;
        
        //randoms
        int bet=(int)(Math.random()*38);//bet out of 38 total values
        int spin=0;//eventual game number
        
        //loop 1
        while (play<totalplays) {//play 1000 games
            int totalgames=0;
            //start of actual 100 spins
            while (play100<cashonhand) {
                spin=(int)(Math.random()*38);
                if (spin==bet) {//if won then add $36
                    totalgames+=36;
                }
                play100++;
            }
            play++;
            //how many times each outcome
            if (totalgames>100) {//how many games won some
                wonsome++;
            } 
            else if (totalgames==0) {//how many games won nothing
                wonnone++;
            }
            else {//how many games lost some money
                lostsome++;
            }
            totalwinnings+= totalgames;
        }    
        //output
        System.out.println("Games with wins but no profit: " + lostsome);
        System.out.println("Games with no winnings: " + wonnone);
        System.out.println("Games with profit: " + wonsome);
        System.out.println("Total winnings (out of $100,000): $" + totalwinnings);
    }
}