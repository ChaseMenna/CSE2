////////////////////////////////////////////////////////////////////////////////
//Chase Menna
//CSE2
//Root.java
//hw03

import java.util.Scanner;
public class Root {
    
    public static void main(String[] args) {
        
        //scanner setup
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //prompt input
        System.out.println("Enter a double:");
        double dubz= myScanner.nextDouble();
        
        //calcs
        double div3=dubz/3;
        double guess2=(div3*div3*div3+dubz)/(3*div3*div3);
        double guess3=(2*guess2*guess2*guess2+dubz)/(3*guess2*guess2);
        double guess4=(2*guess3*guess3*guess3+dubz)/(3*guess3*guess3);
        double sqrt=(2*guess4*guess4*guess4+dubz)/(3*guess4*guess4);
       
        
        //output
        System.out.println("The cube root of " +dubz+ " is appx. "+sqrt);
        System.out.println(sqrt+ "*" +sqrt+ "*" +sqrt+ "=" +(sqrt*sqrt*sqrt));
        
    }
}