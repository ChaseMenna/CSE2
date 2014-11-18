/*Chase Menna
CSE2
FindDuplicates.java
11/18/14
*/

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0; j<10; j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int[] out) {
    int z=0;
    boolean yesno=false;
    
    for (int u=0; u<out.length; u++) {
      for (int y=0; y<out.length; y++) {//find 2 sets
        if (u==y) {
          continue;
        }
        if (out[y]==out[u]) {//check how many dups
          z+=1;
        }//end if
      }//end for y
    }//end for u
    
    if (z>0){//if there are dups
      yesno=true;
    }
    
    return yesno;
  }//end method
  
  public static boolean exactlyOneDup(int[] out) {
    int z=0;
    boolean yesno=false;
    
    for (int u=0; u<out.length; u++) {
      for (int y=0; y<out.length; y++) {//find 2 sets
        if (u==y) {
          continue;
        }
        if (out[u]==out[y]) {//check how many dups
          z+=1;
        }//end if
      }//end for y
    }//end for u
   
    if (z==2){//if 1 pair
      yesno=true;
    }
    return yesno;
  }//end method
}
