////////////////////////////////////////////////////////////////////////////////
//Chase Menna   
//CSE2
//hw03
//FourDigits
//9/16/2014

import java.util.Scanner;
public class FourDigits {
    
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //Inputs
        System.out.println("Enter a double: ");
        double inputA=myScanner.nextDouble();
        
        //Calcs:
        int badpart= (int)inputA;
        double input= (inputA-badpart);
        int input10000=(int)((input*10000));
        
        //individs
        int mew=(int)(input10000/1000)%10;
        int mewtwo=(int)(input10000/100)%10;
        int yugioh=(int)(input10000/10)%10;
        int andres=(int)(input10000)%10;
        
        //output
        System.out.println("The Four Digits are: " +mew+ +mewtwo+ +yugioh+ +andres);
        
    }
}