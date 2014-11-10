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
        int day=0;
        String set1=
        " 1  3  5  7\n"+
        " 9 11 13 15\n"+
        "17 19 21 23\n"+
        "25 27 29 31";
        String set2=
        " 2  3  6  7\n"+
        "10 11 14 15\n"+
        "18 19 22 23\n"+
        "26 27 29 31";
        String set3=
        " 4  5  6  7\n"+
        "10 13 14 15\n"+
        "20 21 22 23\n"+
        "28 29 30 31";
        String set4=
        " 8  9 10 11\n"+
        "12 13 14 15\n"+
        "24 25 26 27\n"+
        "28 29 30 31";
        String set5=
        "16 17 18 19\n"+
        "20 21 22 23\n"+
        "24 25 26 27\n"+
        "28 29 30 31";
        
        System.out.println("Is your birthday in the following months: ");//ask if:
        q=getMonth();
        w=getMonth();
        e=getMonth();
        
        boolean check=checkMonth(q,w,e);
        String mongo=checkcheck(q,w,e,check);
        System.out.println(mongo+" (y/Y/n/N)");
        
        String response=yeah(myscanner);
        
        boolean qwer=yesno(response);
        
        int monthnumb=trial(q,w,e,qwer);
        String mesa=months(monthnumb);
        
        System.out.println("Got the month! Now for the day.");
        System.out.println("*************************************");
        System.out.println("Is your birthday in these: (y/Y/n/N)?");
        System.out.println(set1);
        response=yeah(myscanner);
        qwer=yesno(response);
        if (qwer==true) {
            day+=1;
        }
        
        System.out.println("Is your birthday in these: (y/Y/n/N)?");
        System.out.println(set2);
        response=yeah(myscanner);
        qwer=yesno(response);
        if (qwer==true) {
            day+=2;
        }
        
        System.out.println("Is your birthday in these: (y/Y/n/N)?");
        System.out.println(set3);
        response=yeah(myscanner);
        qwer=yesno(response);
        if (qwer==true) {
            day+=4;
        }
        
        System.out.println("Is your birthday in these: (y/Y/n/N)?");
        System.out.println(set4);
        response=yeah(myscanner);
        qwer=yesno(response);
        if (qwer==true) {
            day+=8;
        }
        
        System.out.println("Is your birthday in these: (y/Y/n/N)?");
        System.out.println(set5);
        response=yeah(myscanner);
        qwer=yesno(response);
        if (qwer==true) {
            day+=16;
        }
        
        System.out.println("Your birthday is "+mesa+" "+day+"!");
        
    }
    //MAIN METHOD
    
    
    public static int getMonth() {
        int p=0;
        if (p==0) {
            int q=1+(rand.nextInt(11));
            return q;
        }
        else if (p==1) {
            int q=0;
            return q;
        }    
        return p;
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
            check=checkMonth(q,w,e);
        }
        String mongo=months(q,w,e);
        return mongo;
    }
    
    public static String checkcheckcheck(int q, int w, int e, boolean check) {
        while (check==true) {
            w=getMonth();
            e=getMonth();
            check=checkMonth(q,w,e);
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
            default: monte+="Default";break;
            }
            //make z turn monte into specific month
            
            if ((i==0) || (i==1)) {//add comma and space on first 2 runs
                monte+=", ";
            }
            i++;
        }
        
        return monte;//return a large string with 3 months and appropriate commas
    }//END OF WHICH INT = MONTH
    
    public static String months(int q) {
        
       
        String monte="";
        
            switch (q) {
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
            default: monte+="Default";break;
            }
            //make z turn monte into specific month
            
            
        
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
    
    public static String repeat(int q, int w, int e, boolean check, String mongo,
     String response) {
        check=checkMonth(q,w,e);
        mongo=checkcheck(q,w,e,check);
        System.out.println("How about: "+mongo+" (y/Y/n/N)");
        
        response=yeah(myscanner);
        return response;
    }
    
    public static String repeatrepeat(int q, int w, int e, boolean check, String mongo,
     String response) {
        check=checkMonth(q,w,e);
        mongo=checkcheckcheck(q,w,e,check);
        System.out.println("How about: "+mongo+" (y/Y/n/N)");
        
        response=yeah(myscanner);
        return response;
    }
    
    public static int trial(int q, int w, int e, boolean qwer) {
        int a=q;
        int s=w;
        int d=e;
        String response="";
        boolean done=false;
        boolean check=true;
        String mongo="";
        int actual=0;
        
        while (done==false) {
            if (qwer==true) {
                a=q;
                s=w;
                d=e;
                q=getMonth();
                w=getMonth();
                check=checkMonth(q,w,e);
                mongo=checkcheck(q,w,e,check);
                response=repeatrepeat(q,w,e,check,mongo,response);
                qwer=yesno(response);
                
                if (qwer==true) {
                    actual=e;
                    done=true;
                }
                else {
                    e=getMonth();
                    q=a;
                    w=getMonth();
                    check=checkMonth(q,w,e);
                    mongo=checkcheck(q,w,e,check);
                    response=repeatrepeat(q,w,e,check,mongo,response);
                    qwer=yesno(response);
                    if (qwer=true) {
                        actual=q;
                        done=true;
                    }
                    else {
                        w=s;
                        actual=w;
                        done=true;
                    }
                }
            }
            else {
                q=getMonth();
                w=getMonth();
                e=getMonth();
                check=checkMonth(q,w,e);
                mongo=checkcheck(q,w,e,check);
                response=repeat(q,w,e,check,mongo,response);
                qwer=yesno(response);
            }
        }
        return actual;
    }
}