//Chase Menna
// lab 09 Methods

import java.util.Scanner;
public class Methods {
    
    public static void main(String[] args) {
        
        Scanner myscanner= new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Enter 3 ints");
        a=getInt(myscanner);
	    b=getInt(myscanner);
	    c=getInt(myscanner);
	    
	    if (a==-1234) {
	        return;
	    }
	    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	    
	    
	    System.out.println("The larger of "+a+", "+b+", and "+c+ 
	    " is " +larger(a,larger(b,c)));
	    
	    
	    System.out.println("It is "+ ascending(a,b,c)+" that "+a+", "+b+
	    ", and "+c+" are in ascending order");
	    
    }//end of main method
    
    public static int getInt(Scanner myscanner) {
        while (myscanner.hasNextInt()==false) {
            System.out.println("You did not enter an int");
            return -1234;
        }
        int k= myscanner.nextInt();
        return k;
        
    }
    
    public static int larger(int x, int y) {
        if (x>y) {
            return x;
        }
        else {
            return y;
        }
    }// end of larger method
    
    public static boolean ascending(int q, int w, int e) {
        if ((q>w && q>e) && ((w>e)==true)) {
            return false;
        }
        else {
            return true;
        }
    }//end of ascending method
}