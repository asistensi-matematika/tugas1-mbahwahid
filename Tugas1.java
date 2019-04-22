package asistensi;
    import java.util.Scanner;
    public class Tugas1 {
        public static void main(String args[]) {
            
          Scanner input = new Scanner(System.in);
          System.out.println("Input:");
          double a = input.nextDouble();
          double b = input.nextDouble();
          double c = input.nextDouble();
          System.out.println(" ");
          
          //Bentuk Polinomial
          if (a==0){
              System.out.println("Nilai a tidak boleh sama dengan 0");
          }else if (a!=0){
              System.out.println("Polinomial "+a+"x^2 +"+b+"x +"+c+" memiliki");
          }
              
          //Diskriminan
          double d = (b*b)-(4*a*c);
          System.out.println("1. Dikriminan \t\t\t : "+d);
          
          //Akar-akar
          if (d==0) {
              double e = ((-b+Math.sqrt(d))/(2*a));
              System.out.println("2. Akar-akar dari polinomial \t : " + e);
          }else if (d>0) {
              double e1 = ((-b+Math.sqrt(d))/(2*a));
              double e2 = ((-b-Math.sqrt(d))/(2*a));
              System.out.println("2. Akar-akar dari polinomial \t : " + e1 + " dan " + e2);
          }else {
              double e3 = -b / 2*a;
              double e4 = Math.sqrt(-d) / (2*a);
              System.out.println("2. Akar-akar dari polinomial \t : " + e3 + "+" + e4 + "i dan " + e3 + "-" + e4 + "i");}

          //Titik Stasioner
          double x = -b/(2*a);  
          double y = -d/(4*a);
          System.out.println("3. Titik stasioner\t\t : ("+x+","+y+")");
          
          //Kecekungan Kurva
          if(a > 0 ){
              System.out.println("4. Kecekungan kurva \t\t : atas");
          }else{
              System.out.println("4. Kecekungan kurva \t\t : bawah");
          }
          
          //Nilai minimum lokal
              System.out.println("5. Nilai minimum lokal \t\t : " +y);
        }
    }