//chase menna
import java.util.Scanner;
public class Arrays {
    
    public static final Scanner myscanner= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int sum =0;
        int max=0;
        int min=0;
        int z=0;
        int list [] = new int[10];
        
        System.out.println("Enter 10 ints: ");
        
        for (z=0; z<10; z++) {
            boolean i=goodInt(myscanner);
            list[z]=getInt(i);   
            if (z==0) {
                min= list [0];
                max= list [0];
            }
            if (list[z]<min) {
                min= list[z];
            }
            if (list[z]>max) {
                max=list[z];
            }
        }
        
        for (z=0; z<10; z++) {
            sum+=list[z];
        }
        
        System.out.println("The max is: "+max);
        System.out.println("The min is: "+min);
        System.out.println("The sum is: "+sum);
        
        for (z=0; z<10; z++) {
            System.out.println(list[z]+"    -    "+list[9-z]);
        }
        
        
        
    }
    
    public static boolean goodInt(Scanner scan) {
        while (true) {
            if (scan.hasNextInt()) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    
    public static int getInt(boolean i) {
        while (true) {
            if (i==true) {
                int p=myscanner.nextInt();
                return p;
            }
            else {
                System.out.println("You did not enter an int, try again: ");
                continue;
            }
        }
    }
}