package Daniel_Liang_9_11;
public class LinearEquation {
    //iniasiasi untuk variabel private
     private double a;
     private double b;
     private double c;
     private double d;
     private double e;
     private double f;
 
     /*A constructor with the arguments for a, b, c, d, e, and f*/
     public LinearEquation(double a, double b, double c, double d, double e, double f){
         this.a= a;
         this.b= b;
         this.c= c;
         this.d= d;
         this.e= e;
         this.f= f;
     }
    
     public LinearEquation(){
     }
     
     public void setA(double inputA) {
        a = inputA;
     }
 
     public void setB(double inputB) {
        b = inputB;
     }

     public void setC(double inputC) {
        c = inputC;
     }

     public void setD(double inputD) {
        d = inputD;
     }

     public void setE(double inputE) {
        e = inputE;
     }

     public void setF(double inputF) {
       f = inputF;
     }

     //methods untuk mengakses nilai a, b, c, d, e, and f*/
     public double getA() {
         return a;
     }
 
     public double getB() {
         return b;
     }
 
     public double getC() {
         return c;
     }
 
     public double getD() {
         return d;
     }
 
     public double getE() {
         return e;
     }
 
     public double getF() {
         return f;
     }
 
     //method isSolvable membalikkan nilai benar bila hasil tidak 0
     public boolean isSolvable(){
         return a*d - b*c != 0;
     }
 
     //method getX getY untuk mendapatkan solusi yang nnti akan dikembalikan
     public double getX(){
         return (e*d - b*f)/(a*d - b*c);
     }
 
     public double getY(){
         return (a*f - e*c)/(a*d - b*c);
     }
 }