//Chase Menna

public class MethodCalls{

//****************************MAIN METHOD*************************************
    
    public static void main(String []  arg){
        
        int a=784,b=22,c;
        
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }//end of main method
    
    public static int addDigit(int a, int b) { 
        int e=Math.abs(a);
        String q=e+"";
        String w=b+"";
        String c=w+q;
        int d=Integer.parseInt(c);
        if (a<0) {
            d*=(-1);
        }
        return d;
    }// end of first method
    
    public static int join(int a, int b) {
        int d=addDigit(b,a);
        return d;
    }
}  
