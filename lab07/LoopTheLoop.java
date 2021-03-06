/* Chase Menna
    CSE2
    10-8-14
    LoopTheLoop.java
    */

import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String args[]) {
        while(true) {
        System.out.println("Enter an integer between 1 and 15: ");
        Scanner myScanner = new Scanner(System.in);
        if (myScanner.hasNextInt()) {
            int nStars = myScanner.nextInt();
            if (nStars >= 1 && nStars <= 15){
                int count = 0;
                String result = "";
                while (count < nStars) {
                    result += "*";
                    System.out.println(result);
                    count++;
                }
            } else {
                System.out.println("int was not in range [1,15]");
                break;
            }
        } else {
            System.out.println("Incorrect Input (not int)");
            break;
        }
      System.out.print("Do you want to continue? (y/Y): ");
      String contIn = myScanner.next();
      if (!(contIn.equals("y") || contIn.equals("Y"))) break;
      }
    }
}