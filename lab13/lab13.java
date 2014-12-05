//Chase Menna
//CSE2
//11/19/14


public class lab13 {
    public static void main(String[] args) {
        int stuff[][]=new int[5][];
        
        for (int i=0; i<5; i++) {
            stuff[i]=new int[i*3+5];
        }
        
        for (int i=0; i<5; i++) {
            for (int j=0; j<(i*3+5); j++) {
                int q=(int)(Math.random()*39);
                stuff[i][j]=q;
                System.out.print(stuff[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int min=0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<(i*3+5); j++) {
                for (int x=0; x<(i*3+5); x++) {
                    if (stuff[i][j] < stuff[i][x]) {
                        int temp=stuff[i][j];
                        stuff[i][j]= stuff[i][x];
                        stuff[i][x]=temp;
                    }
                }
            }
        }
        System.out.println();
        for (int i=0; i<5; i++) {
            for (int j=0; j<(i*3+5); j++) {
                System.out.print(stuff[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        
    }
}