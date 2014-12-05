/* Chase Menna
CSE2
12/5/2014
MatrixSorter.java*/

public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }//***************END MAIN METHOD****************************
    
    public static int[][][] buildMat3d() {
        int[][][] qwer= new int[3][][];//3 slabs
        
        for (int i=0; i<3; i++) {
            qwer[i]=new int[2*i+3][];//rows
            
            for (int j=0; j<qwer[i].length; j++) {
                qwer[i][j]= new int[i+j+1];//columns
                
                //NEXT FILL COLUMNS
                for (int p=0; p<qwer[i][j].length; p++) {
                    qwer[i][j][p]=(int)(99*Math.random()+1);//fill from 1-99
                }
            }
        }
        return qwer;
    } 
    
    
    public static int findMin(int [][][] mat3d) {
        int min=100;//choose max val
        
        for(int i=0; i<mat3d.length; i++){//slab
        
          for(int j=0; j<mat3d[i].length; j++){//row
          
              for(int p=0; p<mat3d[i][j].length; p++){//column (variables)
              
                  if(mat3d[i][j][p]<min){
                      min=mat3d[i][j][p];
                  }
              }
          }
          
        }
        return min;
         
    }
    
    //INITIAL SORT
    public static void sort(int [][] meh) {
        for (int i=0; i<meh.length;i++){
            
            selection(meh[i]);
        }
        
        insertion(meh);
        
    }
    
    public static void selection(int[] meh) {//selection sort for 3
        int q;
        
        for (int i=0; i<meh.length-1; i++) {
            q=i;
            
            for (int j=i+1; j<meh.length; j++)
                if (meh[j]<meh[q]) 
                    q=j;
                    
            int y=meh[q];  
            meh[q]=meh[i];
            meh[i]=y;
            
        }
        
    }
    
    public static void insertion(int[][] meh) {//insertion sort for 3
        for (int j=1; j<meh.length; j++) {

            int key[]=meh[j];
            int k=j-1;;
            while ((k>-1) && (meh[k][0]>key[0])) {
                meh[k+1] = meh[k];
                k--;
            }
            
            meh[k+1]=key;
        }
        
        
    }
    
    
    public static void show(int [][][] mat3d) {
        for(int i=0; i<mat3d.length; i++) { 
            int jay=i+1;//slab #
            System.out.println("------------------Slab "+jay);//print for each slab
            
            for(int j=0; j<mat3d[i].length; j++) { 
                for(int p=0;p<mat3d[i][j].length;p++){
                    
                  System.out.print(mat3d[i][j][p]+" ");//print array
              }
              System.out.println();//skip line
            }
            System.out.println();//skip line
        }
        
    }
    
    
}

