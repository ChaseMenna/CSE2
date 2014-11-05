public class Numbers {
    public static void main(String[] args) {
        
/*        int q=6;
       
        int w=q-2;
            
         
        for (int i=0; i<w; i++) {
            
            for (int e=0; e<q-2; e++) {
                
                for (int a=0; a<w; a++) {
                    System.out.print(q);
                    
                }//print q-2 ammount of q
                
                System.out.println("");
                w--;
                
                
            }//how many to put in each line
            q--;
            
            
        }*/
        int q=6;
        int i=0;
        
        while (i<q) {
            int w;
            if (q<3) {
                w=1;
                //continue; //break;
            }
            else {
                w=q-2;
            }
            
            while (i<w) {
                int a=0;
                while (a<w) {
                    System.out.print(q);
                    a++;
                }
                System.out.println("");
                w--;
                
            }
            q--;
        }
    }
}


//  for (x=0; x<r, x>w; x++) {
//    System.out.print("blargh");
//  }