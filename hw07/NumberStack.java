/* Chase Menna
    CSE2
    hw07 NumberStack.java
    10-18-14
    
    
    
              EACH LOOP IS ON ITS OWN. IN ORDER TO SWAP 
        BETWEEN FOR/WHILE/DO-WHILE JUST TAKE OUT THE COMMENTS
        
    */

import java.util.Scanner;    
public class NumberStack {
    
    public static void main(String[] args) {

        //Scanner setup:
        Scanner myscanner= new Scanner(System.in);
    
        //Prompt:
        System.out.print("Enter an int (1-9). ");
        int numb=myscanner.nextInt();
    
        int y=1;
        
        if ((numb<9) && (numb>0)) {// if number is enough

//***********************FOR LOOP***********************************************
/*

            for (int size=0; size<numb; size++) {
                
                
                for (int rows=0; rows<y; rows++) {
                    System.out.println(" ");
                    
                    
                    
                    for (int i=0; i<((y*2)-1); i++) {
                        
                        System.out.print(y);
                        
                    }//end of print loop
                    
                }// for row loop
                System.out.println("");
                
                for (int dash=0; dash<((y*2)-1); dash++) {
                    System.out.print("-");
                }
                System.out.print("");
                
                y++;    
            }// for size loop
    */    
//***************************WHILE LOOP*****************************************
/*            
            int size=0;
            
            
            while (size<numb) {
                int rows=0;
                while (rows<y) {
                    
                    System.out.println(" ");
                    int i=0;
                    while (i<((y*2)-1)) {
                        
                        System.out.print(y);
                        i++;
                        
                    }//end of print loop
                    rows++;
                    
                }// end of row loop
                
                System.out.println("");
                int dash=0;
                while (dash<((y*2)-1)) {
                    
                    System.out.print("-");
                    dash++;
                    
                }
                
                System.out.print("");
                
                y++;
                
                size++;
                
            }//size loop
*/        
//**************************DO WHILE LOOP***************************************
            
            int size=0;
            
            do {
                int rows=0;
                do {
                    System.out.println(" ");
                    int i=0;
                    do {
                        System.out.print(y);
                        i++;
                        
                    }while (i<((y*2)-1));
                    rows++;
                    
                } while (rows<y);
                
                System.out.println("");
                int dash=0;
                do {
                    System.out.print("-");
                    dash++;
                    
                }while (dash<((y*2)-1));
                
                System.out.print("");
                y++;
                size++;
                
            } while (size<numb);


//******************************************************************************            
        }//end of if number is in range 1-9
        else {
            System.out.println("Enter an int between 1 and 9.");
            return;
        }// end of else statement
    }
}