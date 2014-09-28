/*
Chase Menna
CSE2
hw05
BoolaBoola.java
9-28-14
*/

import java.util.Scanner;
public class BoolaBoola {
    
    public static void main (String[] args) {
        
        //Scanner Setup
        Scanner myscanner= new Scanner(System.in);
        
        //Random setup:
        boolean variable1=true; 
        boolean variable2=true; 
        boolean variable3=true;
        
        int var1= (int)(Math.random()*2);
        
            switch (var1) {
                case 0: 
                    variable1= true;
                break;
                
                case 1:
                    variable1=false;
                break;
            }// variable 1 switch
        
        int var2= (int)(Math.random()*2);
            
            switch (var2) {
                case 0: 
                    variable2= true;
                break;
                
                case 1:
                    variable2=false;
                break;
            }// variable 2 switch
        
        int var3= (int)(Math.random()*2);  
        
            switch (var3) {
                case 0: 
                    variable3=true;
                break;
                
                case 1:
                    variable3=false;
                break;
            }// variable 3 switch
        
        //random setup for && ||
        int andor= (int)(1+(Math.random()*5));
        String ans;
        
            switch (andor) {
                case 1: 
                    System.out.println("Does "+variable1+" || "+variable2+" || "+variable3+" = t/f");
                    ans= myscanner.next();
                    
                    if (((variable1 || variable2 || variable3)==true)&& (ans.equals("t"))) {
                        System.out.println("Correct!");
                    }
                    else {
                        System.out.println("Sorry, try again.");
                        return;
                    }
                break;// ||, ||
                
                case 2:
                    System.out.println("Does "+variable1+" || "+variable2+" && "+variable3+" = t/f");
                    ans= myscanner.next();
                    
                    if (((variable1 || variable2 && variable3)==true) && (ans.equals("t"))) {
                        System.out.println("Correct!");
                    }
                    else if (((variable1 || variable2 && variable3)==false) && (ans.equals("f"))) {
                        System.out.println("Correct!");
                    }
                    else {
                        System.out.println("Sorry, try again.");
                        return;
                    }
                break;// ||, &&
                
                case 3: 
                    System.out.println("Does "+variable1+" && "+variable2+" || "+variable3+" = t/f");
                    ans= myscanner.next();
                    
                    if (((variable1 && variable2 || variable3)==true)&& (ans.equals("t"))) {
                        System.out.println("Correct!");
                    }
                    else if (((variable1 && variable2 || variable3)==false)&& (ans.equals("f"))) {
                        System.out.println("Correct!");
                    }
                    else {
                        System.out.println("Sorry, try again.");
                        return;
                    }
                break;// &&, ||
                
                case 4:
                    System.out.println("Does "+variable1+" && "+variable2+" && "+variable3+" = t/f");
                    ans= myscanner.next();
                    
                    if (((variable1 && variable2 && variable3)==true)&& (ans.equals("t"))) {
                        System.out.println("Correct!");
                    }
                    else if (((variable1 && variable2 && variable3)==false)&& (ans.equals("f"))) {
                        System.out.println("Correct!");
                    }
                    else {
                        System.out.println("Sorry, try again.");
                        return;
                    }
            break;// &&, &&
            }// andor switch
    }
}
