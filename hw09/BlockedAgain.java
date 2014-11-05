/* Chase Menna
    CSE2
    hw09 BlockedAgain.java
    10-30-14
    */

import java.util.Scanner;
public class BlockedAgain {
    
    //Scanner setup final for all methods
    public static final Scanner myscanner= new Scanner(System.in);
    
//**********************MAIN METHOD********************************************
    public static void main(String []s) {
        int m;
        
        //force user to enter int in range 1-9, inclusive.
        m = getInt(myscanner); 
        
        allBlocks(m);
    }//END OF MAIN METHOD
    
    public static int getInt(Scanner myscanner) {
        System.out.print("Enter an int 1-9, inclusive: ");
        while(true) {
            if (checkInt(myscanner)==true) {
                int a=myscanner.nextInt();
                
                if(checkRange(a)==true) {
                    return a;
                }//if both methods return true
                else {
                    System.out.print("You didn't enter an int between [1,9], try again: ");
                    continue;
                }//if int isnt in range
            }//if int is true but range is unknown
            else {
                System.out.print("You didn't enter an int, try again: ");
                myscanner.next();
                continue;
            }//if not an int
            
        } //end of while loop
        
    }//scanner takes input and checks if int and in range 1-9 and returns int to main

    public static boolean checkInt(Scanner myscanner) {
        if (myscanner.hasNextInt()) {
            return true;
        }//number is int
        else {
            return false;
        }//not an int
        
    }//if input is int return true to getInt otherwise return false
    
    public static boolean checkRange(int w) {
        if (w<1) {
            return false;
        }// if less than 1 return false
        else if (w>9) {
            return false;
        }//if more than 9 return false
        else {
            return true;
        }//all others return true
    }//check if input is within range and return boolean to getInt
    
    public static void allBlocks(int z) {
        int s=1;
        while (s<=z) {//call block z number of times
            block(s,z);//block has to know max number of spaces
            s++;
        }
    }
    
    public static void block(int s, int z) {
        int width= 2*s-1;//number of columns for each number and its dash line
        int spaces= z-s;//number of spaces before each number/dash starts
        char c= (char) (' '+s); //convert s to a char to print
        int q=0;
        while (q<s) {
            line(c, width, spaces);//pass through spaces number
            q++;
        }
        line('-', width, spaces);//separator line
        
    }
    
    public static void line(char c, int length, int spaces) {//what prints on each line
        int i=0;
        while (i<spaces) {
            System.out.print(" ");
            i++;
        }// end of spaces loop
        
        int u=0;
        while (u<length) {
            System.out.print(c);
            u++;
        }//end of printing char/dash
        System.out.println("");//new line
    }
}