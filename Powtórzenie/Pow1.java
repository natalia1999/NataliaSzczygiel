import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Pow1{
     
     int sumacyfr(int n){
        int s=0;
        while(n>0)
        {s=s+n%10;
         n=n/10;    
        }
    return s;
    }
    
     
    public static void main(String [] args) throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("powt.txt");
        File file = new File("cyfry.txt");
        Scanner in = new Scanner(file); 
        Pow1 funkcje = new Pow1();
        int a=0;
        int max=0;
        while(in.hasNextLine()){
           String text=in.nextLine();
           int liczba=Integer.parseInt(text);
           if(liczba%2==0)
           a++;
           if(funkcje.sumacyfr(liczba)>max)
           max=funkcje.sumacyfr(liczba);
           
           System.out.println("liczba dziesiętna "+ Integer.parseInt( text , 2 ));
        }
        zapis.println("a) "+a);
        zapis.println("b) "+max);
        zapis.println("c) ");
        zapis.println("d) ");
        zapis.close();
    }
}