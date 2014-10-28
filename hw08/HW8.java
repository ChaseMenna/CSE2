/*Chase Menna
    CSE2
    HW08 HW8.java
    10-27-14
    */

import java.util.Scanner;

public class HW8{
  //******************MAIN METHOD******************************************  
  // ****************DO NOT TOUCH**********
  public static void main(String []arg){
      
	char input;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
	
  }  //end of main method
  
  public static char getInput(Scanner myScanner, String cc) {
      
    while(true) {
      String input = myScanner.next();
      
      if(input.length() != 1) { // test if 1 char
        System.out.print("You did not enter a char.");
        continue;
      }
      for(int i = 0; i < cc.length(); i++) {//sees if input is one of cc
          
          if(input.charAt(0) == cc.charAt(i)) {
            char qwer=input.charAt(0);//save char at cc
            return qwer; 
          }
      }
      
      System.out.print("You did not enter a char from list '" 
          +cc+ "'; try again: ");
    }
  }//end of getinput 1
  
  public static char getInput(Scanner myscanner,String cc, int tries) {
      int j=0;
      
      while (j<tries) {//make tries loop
          String input=myscanner.next();
          
          if (input.length() != 1) {
              System.out.print("You did not enter a char. ");
              continue;
          }
          for (int i=0; i<cc.length(); i++) {
              if(input.charAt(0) == cc.charAt(i)) {
                char qwer=input.charAt(0);
                return qwer; 
              }
          }
          j++;
      }
      //IF FAILED:
      System.out.println("You failed after "+tries+" tries.");
      return ' ';// sends to if in main 
    }//end of method 2
  
  public static char getInput(Scanner myscanner, String choose , String cc) {
    while(true) {
      System.out.println(choose); //display "choose a digit" ...?
      
      System.out.print("Enter one of: ");
      
      for(int j = 0; j < cc.length()-1; j++) {
        System.out.print("'"+cc.charAt(j)+"',");
      }// print numbers of 012345689 individual --length
      
      System.out.print("'"+cc.charAt(cc.length()-1)+"': ");

      String input = myscanner.next();
      
      if(input.length() > 1) {
        System.out.print("Enter exactly one character: ");
        continue;
      }
      
      for(int i = 0; i < cc.length(); i++) {
          if(input.charAt(0) == cc.charAt(i)) {
            char qwer=input.charAt(0);
            return qwer; 
          }
      }
      
      System.out.println("You did not enter an acceptable character");
    }
  }// end of 3rd method getinput
  
}
