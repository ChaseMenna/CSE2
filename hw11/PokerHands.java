/* Chase Menna
    CSE2
    12-4-14
    PokerHands.java
    */

import java.util.Scanner;
import java.util.Arrays;
public class PokerHands {
    public static final Scanner scan=new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] hand=new String[5];
        String response="";
        String []real= new String[5];
        int[] suit= new int[5];
        
        
        
        
        do {
            for (int i=0; i<5; i++) {
                System.out.println("Enter one of 'a','k','q','j','10'...'2'");
                
                String test[]={"a","k","q","j","10","9","8","7","6","5","4","3","2"};
                
                
                
                if (scan.hasNext()) {
                    hand[i]=scan.next();
                    
                    for (int p=0; p<test.length; p++){
                        if (hand[i].equals(test[p])) {
                            real[i]=hand[i];
                            p=test.length;//move past loop
                        }
                        else {
                            do {
                                p++;
                                
                                if (p>=test.length) {
                                    System.out.println("Unacceptable input.");
                                    
                                    return;
                                }
                                
                                
                            }while(!hand[i].equals(test[p]));
                            //check every p if not equal
                            
                            
                            real[i]=hand[i];
                            p=test.length;
                            
                        }
                    }//test if hand is usable
                }
                else {
                    System.out.println("you didn't enter an appropriate response.");
                    return;
                }
                
                //******END OF GETTING FACE, START GET SUIT************
                String q="";
                System.out.println("Enter a suit: 's','d','c', or 'h'.");
                if (scan.hasNext()) {
                    q=scan.next();
                    if (q.equals("s")) {
                        suit[i]=3;//spades=3
                    }
                    else if (q.equals("d")) {
                        suit[i]=1;//diamonds=1
                    }
                    else if (q.equals("c")) {
                        suit[i]=0;//clubs=0
                    }
                    else if (q.equals("h")) {
                        suit[i]=2;//hearts=2
                    }
                    else {//if didnt enter s,d,h or c
                        System.out.println("you didn't enter an appropriate response.");
                        return;
                    }
                    
                    //end of getting suit
                    //next see if card has been used
                    String qwer="";
                    String qwert="";
                    for (int u=0; u<i; u++) {
                        
                        qwer=real[i]+suit[i];
                        qwert=real[u]+suit[u];
                        
                        if (qwer.equals(qwert)) {
                            System.out.println("This card has already been entered.");
                            return;
                        }
                        
                    }
                    
                    
                }//END OF GET SUIT
                
            }//end of get hand
            
            //test
            /*for (int u=0; u<real.length; u++) {
                System.out.println(real[u]+"     "+suit[u]);
            
            }*/
            
            //NEXT TURN HAND INTO AN INT
            int[]hando= new int[5];
            hando=makeints(real);
            //hand is now in ints called hando
            
            
            //next make suit works (52 cards)
            
            for (int e=0; e<5; e++) {
                hando[e]= hando[e]+(suit[e]*13); //multiply suit val and face val out of 51
                
            }
            System.out.println();//skip a line
            //print hand
            showOneHand(hando);
            
            System.out.println();// skip another line
            
            //what is the hand rank?
            String rank=getrank(hando);
            
            System.out.println(rank);
            
            System.out.println("Enter another hand? (y/Y) or anything else to exit.");
            response=scan.next();
        }while(response.equals("y") || response.equals("Y"));
        response="";

    }//***************END OF MAIN METHOD***************************
    
    
    public static String getrank(int [] hando) {
        int [] ranknumb= new int[13];//each rank number
        int[] rankfreq= new int[5];//# of times ^rank comes up
        String rank="";
        
        
        //CHECK PAIRS
        //find the right pair rank(2,3 or 4)
        for (int l=0; l<13; l++) {
            for (int r=0; r<5; r++) {
                if (hando[r]%13==l) {
                    ranknumb[l]++;
                }
            }
        }
        //now find how many times the pair shows up
        for(int q = 0; q<5; q++) {
            for(int w = 0; w<13; w++) {
                if(ranknumb[w]==q) {
                    rankfreq[q]++;
                }    
            }
        }
        if (rankfreq[2]==1) {
            rank="One Pair";
        }
        if (rankfreq[2]==2) {
            rank="Two Pair";
        }
        if (rankfreq[4]==1) {
            rank="Four of a Kind";
        }
        if (rankfreq[3]==1) {
            rank="Three of a Kind";
        }
        if (rankfreq[3]==1 && rankfreq[2]==1) {
            rank="Full House";
        }
        //************************************
        
        //CHECK STRAIGHT
        
        int straight=0;
        if (rankfreq[1]==5) {
            
            for (int x=1; x<13; x++) {
                if (ranknumb[x]==ranknumb[x-1]) {
                    if (ranknumb[x]==1) {//get 5 1's next to each other=straight
                        straight++;//counter
                    }    
                        
                }
                //System.out.println(ranknumb[x]);
            }
            //System.out.println(straight);
            
            
            if (straight==4) {
                rank="Straight ";
            }
  
        }
        
        //************************************
        
        //CHECK ROYAL
        
        
        if (straight==4) {
            if (hando[0]==0 ||hando[0]==13 ||hando[0]==26 ||hando[0]==39) {
                rank="Royal ";//leave room for flush
            }
            
        }
        
        //*************************************
        
        
        //CHECK FLUSH*******(MAKE SURE ITS "LAST" TO ADD TO END OF NAME)
        int flushcount=0;
        int[] flushrank= new int[5];
        
        
        
        for (int h=0; h<5; h++) {
            flushrank[h]=hando[h]/13;
            
        }
        int flushsuit=hando[0]/13;//main suit
        
        for (int f=1; f<5; f++) {
            if (flushrank[f]==flushsuit) {//if suits are all equal
                flushcount++;//use as counter
            }
        }   
        
        if (flushcount==4) {
            
            rank+="Flush";//add to name so that straight flush and royal can be shortened
        }
        
        
        //*************************************
        //GET HIGH CARD IF ALL FAIL
        if (rank.equals("")) {
            rank="High Card";
        }
        return rank;
    }
    
    public static int[] makeints(String[] handy) {
        int[] hanz= new int[5];
        String face="";
        for (int y=0; y<5; y++) {
            face=handy[y];
            switch (face) {
                case "a":
                    hanz[y]=0;
                    break;
                case "k":
                    hanz[y]=1;
                    break;
                case "q":
                    hanz[y]=2;
                    break;
                case "j":
                    hanz[y]=3;
                    break;
                case "10":
                    hanz[y]=4;
                    break;
                case "9":
                    hanz[y]=5;
                    break;
                case "8":
                    hanz[y]=6;
                    break;
                case "7":
                    hanz[y]=7;
                    break;
                case "6":
                    hanz[y]=8;
                    break;
                case "5":
                    hanz[y]=9;
                    break;
                case "4":
                    hanz[y]=10;
                    break;
                case "3":
                    hanz[y]=11;
                    break;
                case "2":
                    hanz[y]=12;
                    break;
            }
        }
        
        return hanz;
    }
    
    public static void showOneHand(int handing[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",  "Spades:   "};
    	String face[]={
           "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      	"4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){
          	out+=suit[s];//setup the name of suit
          	for(int rank=0;rank<13;rank++) {//get card face
            	for(int card=0;card<5;card++) {//check each card in hand
                 	if(handing[card]/13==s && handing[card]%13==rank) {
                 	    out+=face[rank];
                 	}// end if
                  	
            	}//end for card
          	}//end for rank
          	
          	out+='\n';//end line
          	
    	}//end for setup 	
	
	System.out.println(out);
  }
}