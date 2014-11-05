import java.util.Scanner;
import java.util.Random;
public class GuessBirthday {
    
    public static final Scanner myscanner = new Scanner(System.in);
    
    public static final Random rand= new Random();
    
    public static void main(String[] args) {
        int p=0;
        int q=0;
        int w=0;
        int e=0;
        
        System.out.println("Is your birthday in the following months: ");//ask if:
        q=getMonth();
        w=getMonth();
        e=getMonth();
        
        boolean check=checkMonth(q,w,e);
        String mongo=checkcheck(q,w,e,check);
        System.out.println(mongo+" (y/Y/n/N)");
        
        String response=yeah(myscanner);
        
        
        boolean qwer=yesno(response);
        
        for (p; p<3; int i++) {
            
            if (qwer==true) {
                p++;
                q=getMonth();
                w=getMonth();
                continue;
            }
            else {
                p=0;
                q=getMonth();
                w=getMonth();
                e=getMonth();
                continue;
            }
            response=repeat();
        
        }
        //3 things each value goes up 1 and it stays same if up 1
        
        
        
    }//MAIN METHOD
    
    
    public static int getMonth() {
        int p=0;
        if (p==0) {
            int q=1+(rand.nextInt(11));
            return q;
        }
        else if (p==1) {
            
        }    
    
    }
    
    public static boolean checkMonth(int q, int w, int e) {
        boolean qwer=true;
        
        if (((q==w)||(q==e)||(w==e))==false) {
            qwer=false;
        }
        return qwer;
    }
    
    public static String checkcheck(int q, int w, int e, boolean check) {
        while (check==true) {
            q=getMonth();
            w=getMonth();
            e=getMonth();
        }
        String mongo=months(q,w,e);
        return mongo;
    }
    
    public static String months(int q, int w, int e) {
        int z=0;
        int i=0;
        String monte="";
        
        while (i<3) {//run 3 times
            if (i==0) {//first z=q
                z=q;
            }
            if (i==1) {//second z=w
                z=w;
            }
            if (i==2) {//third z=e
                z=e;
            }
            
            switch (z) {
            case 1: monte+="January";break;
            case 2: monte+="February";break;
            case 3: monte+="March";break;
            case 4: monte+="April";break;
            case 5: monte+="May";break;
            case 6: monte+="June";break;
            case 7: monte+="July";break;
            case 8: monte+="August";break;
            case 9: monte+="September";break;
            case 10: monte+="October";break;
            case 11: monte+="November";break;
            case 12: monte+="December";break;
            }
            //make z turn monte into specific month
            
            if ((i==0) || (i==1)) {//add comma and space on first 2 runs
                monte+=", ";
            }
            i++;
        }
        
        return monte;//return a large string with 3 months and appropriate commas
    }//END OF WHICH INT = MONTH
    
    public static String yeah(Scanner myscanner) {
        String response="";
        
        while (true) {
            if (myscanner.hasNext()) {
                response=myscanner.next();
                if (!(response.equals("y")||response.equals("Y")||response.equals("N")||
                    response.equals("n"))) {
                        System.out.println("You did not enter (y/Y/n/N), try again: ");
                        continue;
                }
                else {
                    return response;
                }
            }
            else {
                System.out.print("You did not enter a String, try again: ");
                myscanner.next();
                continue;
            }
        }
    }
    
    public static boolean yesno(String response) {
        boolean a=true;
        switch (response) {
            case "Y":
            case "y":
                a=true;
                break;
            case "N":
            case "n":
                a=false;
                break;
        }
        return a;
    }
    
    public static String repeat() {
        boolean check=checkMonth(q,w,e);
        String mongo=checkcheck(q,w,e,check);
        System.out.println(mongo+" (y/Y/n/N)");
        
        String response=yeah(myscanner);
    }
}