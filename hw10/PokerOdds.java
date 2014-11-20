import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static final Scanner scan=new Scanner(System.in);
  
  public static final Random rand=new Random();
    
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  //*******************^^^^MAIN METHOD^^^^**************************
  public static void showHands() {
    
      String answer="";
      int[] deck= new int[52];
      int[]hand=new int[5];
      
      
      do {
          
          for (int i=0; i<52; i++) {
              deck[i]=i;
          }
          
          for (int i=0; i<5; i++) {
              hand[i]=-1;
          }
          
          String clubs="";
          String hearts="";
          String diamonds="";
          String spades="";
          
          int counter=0;
          for (int i=0; i<(5+counter); i++) {//find 5 real cards
              int cardey=rand.nextInt(52+ counter);
              int card=deck[cardey];
              
              int suitnumb=0;
              /*if clubs sn=3
              if hearts sn=1
              if dia sn=2
              if spades sn=0 */
              if (card>=0 && card<13) {
                suitnumb=1;
              }
              else if (card>=13 && card<26) {
                suitnumb=2;
              }
              else if (card>=26 && card<39) {
                suitnumb=3;
              }
              else if (card>=39 && card<52){
                suitnumb=0;
              }
              else {
                cardey=rand.nextInt(52+ counter);
                card=deck[cardey];
                counter++;
                continue;
              }
              
              //save card value
              
              
              hand[i-counter]=deck[cardey];
              deck[cardey]=deck[51];
              deck[51]=-1;
              
              //deck[cardey]=deck[51-i];
              //deck[51-i]=hand[i];
              
              int andres=card%13;
              int andres2=andres-2;
              
              String[] jay = {" A "," K "," Q "," J "};
              //check suit
              if (suitnumb==1) {
                  
                  if (andres<4) {
                      hearts+=jay[andres];
                  }
                  else {
                      hearts+=" "+(andres2)+" ";
                  }
              }
              else if (suitnumb==2) {
                  
                  if (andres<4) {
                      diamonds+=jay[andres];
                  }
                  else {
                      diamonds+=" "+(andres2)+" ";
                  }
              }
              else if (suitnumb==3) {
                  //andres=(card&4);
                  if (andres<4) {
                      clubs+=jay[andres];
                  }
                  else {
                      clubs+=" "+(andres2)+" ";
                  }
              }
              else if (suitnumb==0){
                  //andres=(card%4);
                  if (andres<4) {
                      spades+=jay[andres];
                  }
                  else {
                      spades+=" "+(andres2)+" ";
                  }
              }
          }//end for loop
           
          
          System.out.println("Clubs: "+clubs);
          System.out.println("Hearts: "+hearts);
          System.out.println("Diamonds"+diamonds);
          System.out.println("Spades "+spades);
          
          System.out.println("Want another hand? (y/Y)for yes or anything else for no");
          answer=scan.next();
      } while(answer.equals("Y") || answer.equals("y"));
      
  }
  
  public static void simulateOdds() {
    int[] ranks=new int[5];
    int[] onepair = new int[13];
    int u=0;
    String[] jay = {" A "," K "," Q "," J "," 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", 
          " 8 ", " 9 ", " 10 "};
    
    for (int tenny=0; tenny<10000; tenny++) {
      int[] deck= new int[52];
      int[]hand=new int[5];
      for (int q=0; q<52; q++) {
          deck[q]=q;
      }
      
      for (int q=0; q<5; q++) {
          hand[q]=-1;
      }
      
      int counter=0;
      
      String[] ben= new String[5];
      
      for (int q=0; q<(5+counter); q++) {//NOTE WATCH Q!!!!!!
          int cardey=rand.nextInt(51);
          int card=deck[cardey];
          
          int suitnumb=0;
          if (card>=0 && card<13) {
            suitnumb=1;
            
          }
          else if (card>=13 && card<26) {
            suitnumb=2;
          }
          else if (card>=26 && card<39) {
            suitnumb=3;
          }
          else if (card>=39 && card<52){
            suitnumb=0;
          }
          else {
            cardey=rand.nextInt(51);
            card=deck[cardey];
            counter++;
            continue;
          }
        
          hand[q-counter]=deck[cardey];
          deck[cardey]=deck[51];
          deck[51]=-1;
          
          int andres=card%13;
          int andres2=andres-2;
          
          
          for (int i=0; i<5; i++) {
              if (suitnumb==0) {
                ben[i]+= ""+suitnumb+"";
                if (andres<4) {
                  ben[i]=jay[andres];
                }
                else {
                  ben[i]=" "+andres2+" ";
                }
                
              }
              else if (suitnumb==1) {
                ben[i]+= ""+suitnumb+"";
                if (andres<4) {
                  ben[i]=jay[andres];
                }
                else {
                  ben[i]=" "+andres2+" ";
                }
                
              }
              else if (suitnumb==2) {
                ben[i]+= ""+suitnumb+"";
                if (andres<4) {
                  ben[i]=jay[andres];
                }
                else {
                  ben[i]=" "+andres2+" ";
                }
                
              }
              else if (suitnumb==3) {
                ben[i]+= ""+suitnumb+"";
                if (andres<4) {
                  ben[i]=jay[andres];
                }
                else {
                  ben[i]=" "+andres2+" ";
                }
                
              }
          }
      }
      
      for (int i=0; i<5; i++) {
        ranks[i]=hand[i]%13;
      }
      
      
      if((FindDuplicates.exactlyOneDup(ranks))==false) {
        u+=1;
      }
      
      String[] suits = {"", "", "", "",};
      
      for(int j = 0; j < 4; j++) {
        for(int p = 0; p < 5; p++) { 
          if(j == hand[p] / 13) { 
            suits[j] += ben[p]; 
          }
        }
      }
      
      for(int i = 0; i < 4; i++) { 
        
        for(int j = 0; j < 13; j++) { 
          
          if(suits[i].equals(jay[j])) {
            (onepair[j])++;
            
          }
        }
      }
    }
    System.out.println("Exactly one pair:");
    
    for(int i = 0; i < 13; i++) {
      if (i<12){
        System.out.printf("%s    %4d \n",jay[i],onepair[i] /4);
      }
      else {
        System.out.printf("%s   %4d \n",jay[i],onepair[i] /4);
      }
    }
    
    System.out.println("--------------------------------");
    System.out.println("Times not exactly one pair: " + u);
          
    
  
  }
}