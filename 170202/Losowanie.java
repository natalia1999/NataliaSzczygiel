import java.util.Scanner;
import java.util.Random;

public class Losowanie{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
         Random rand = new Random();
        System.out.println("Podaj zakres danych: ");
        System.out.print("x: ");
        int x=in.nextInt();
        System.out.print("y: ");
        int y=in.nextInt();
        System.out.println(rand.nextInt(y-x+1)+x);
    
        
    }
    
}