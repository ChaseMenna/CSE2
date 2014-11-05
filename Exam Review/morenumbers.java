public class morenumbers {
    public static void main(String[] args) {
        
        int q=5;
        
        for (i=0; i<7; i++) {
            
            for (w=0; w<9; w++) {
                int p=4;
                while (p>=0) {
                    
                    int z=q-p;
                    if (z<0) {
                        System.out.print('-');
                    }
                    
                    System.out.print(z);
                    p--;
                    
                }
                p=1;
                while (p<q) {
                    
                }
            }
        }
        
        
    }
}

/*  123454321
    012343210
    -0123210-
    --01210--
    ---010---
    ----0----
    ---------
    
    */