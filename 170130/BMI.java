public class BMI{
    public static void main(String[] args){
      if(args.length==2) 
      {
       double wz= Double.parseDouble ( args[0]);
       double wg=Double.parseDouble (args[1]);
       double bmi;
       bmi= wg/(wz*wz);
         if ( bmi<18.5)
           System.out.println("NIEDOWAGA .Twoje Bmi to "+bmi);
         else if ( bmi >18.5 && bmi<24.99)
                System.out.println("WAGA PRAWIDŁOWA .Twoje Bmi to "+bmi);
              else 
               System.out.println("NADWAGA .Twoje Bmi to "+bmi);
          
        }
        else 
        System.out.println("BŁĄD DANYCH");
    }
}