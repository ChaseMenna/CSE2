// Chase Menna  

import java.util.Scanner;
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double[] x, double[] y) {
      int j=x.length;
      int i=y.length;
      boolean z=false;
      if (j==i) {
          for (int q=0; q<j; q++) {
              if (x[q]==y[q]) {
                  z= true;
              }
              else {
                  return false;
              }
          }
      }
      else {
          z= false;
      }
      return z;
  }
  
  public static double[] addArrays(double[] x, double[] y) {
      int i=x.length;
      int j=y.length;
      int length=0;
      
      
      if (i<j) {
          length=j;
      }
      else {
          length=i;
      }
      
      double[] add=new double[length];
      for (int q=0; q<length; q++) {
          if (q>=i) {
              add[q]=y[q];
          }
          else if (q>=j) {
              add[q]=x[q];
          }
          else {
              add[q]=x[q]+y[q];
          }
          
      }
      return add;
  }
}
