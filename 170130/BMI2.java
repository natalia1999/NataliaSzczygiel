import java.util.Scanner;
public class BMI2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a;
       do{ 
           System.out.println("Podaj wzrost");
            double wz=in.nextDouble();
            System.out.println("Podaj wage");
            double wg=in.nextDouble();
          
         double bmi;
          bmi= wg/(wz*wz);
          if ( bmi<18.5)
              System.out.println("NIEDOWAGA .Twoje Bmi to "+bmi);
              else if ( bmi >18.5 && bmi<24.99)
              System.out.println("WAGA PRAWIDŁOWA .Twoje Bmi to "+bmi);
              else 
              System.out.println("NADWAGA .Twoje Bmi to "+bmi);
           
         System.out.println("Kontynuować? 1-Tak 2-Nie");
        a = in.nextInt();
       
       }while (a==1);
    }
}