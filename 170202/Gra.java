import java.util.Random;
 
 public class Gra{
    public static void main (String[] args){
        Random rand = new Random();
         int r= rand.nextInt(2)+0 ; 
         int a=Integer.parseInt(args[0]);
            if (a==0 || a==1 && args.length==1)
            {
                if(r==a)
                {
                    System.out.println("Wygrałeś ");
                }
                else 
                System.out.println("Przegrałeś ");
            }
            else 
            System.out.println("BŁĄD DANYCH");
            

}
}
 
 
 
 
 
 
 
 
 
 