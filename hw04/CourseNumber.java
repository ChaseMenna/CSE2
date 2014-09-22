////////////////////////////////////////////////////////////////////////////////
/* Chase Menna
    CSE2
    CourseNumber.java
    9-21-14
    hw04
    */

import java.util.Scanner;    
public class CourseNumber {
    
    public static void main(String[] args) {
        
        //Scanner setup
        Scanner myscanner= new Scanner (System.in);
        
        //Display:
        System.out.println("Enter 6 digit course number: ");
        int coursenumber= myscanner.nextInt();
        
        //if next int is wrong (outside 186510-201440)
        if (coursenumber<=186509) {
            System.out.println("Must enter CN between 186510-201440");
            return;
        }
        else if (coursenumber>=201441) {
            System.out.println("Must enter CN between 186510-201440");
            return;            
        }
        else if ((186510<=coursenumber) && (coursenumber<=201440)==true) {
            coursenumber=coursenumber;
        }
        else {
            System.out.println("Course Number must be an int");
            return;
        }// end of year options
        
        //Determine Year first 4 digits
        int courseyear= (int)(coursenumber/100); //isolate digits
        
        System.out.println("Class "+coursenumber+" is in "+courseyear); //display year
        
        //Determine semester last 2 digits
        int semester= coursenumber%100;
        
        if (semester==10) {
            System.out.println("and the Spring Semester");
        }
        else if (semester==20) {
            System.out.println("and is in the Summer 1 Semester");
        }
        else if (semester==30) {
            System.out.println("and is in the Summer 2 Semester");
        }
        else if (semester==40) {
            System.out.println("and is in the Fall Semester");
        }
        else {
            System.out.println("Enter an appropriate semester int (10/20/30/40)");
            return;
        }
       

    }    
}