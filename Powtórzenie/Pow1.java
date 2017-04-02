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
    String bin(int d){

   String text = "";
     while(d>0){
        text=text + (char)(d%2 + 48);     
        d=d/2;
        }
        String reverse = new StringBuffer(text).reverse().toString(); 
        return reverse;
    }
        
     
    public static void main(String [] args) throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("powt.txt");
        File file = new File("cyfry.txt");
        Scanner in = new Scanner(file); 
        Pow1 funkcje = new Pow1();
        int a=0;
        int liczba=in.nextInt();
        int n=funkcje.sumacyfr(liczba);
        int liczbamax=liczba;
        zapis.println("b) ");         
        while(in.hasNextLine()){
           String text=in.nextLine();
           zapis.println(liczba+" "+funkcje.bin(liczba));
             liczba=in.nextInt();
           if(liczba%2==0)
           a++;
           if(funkcje.sumacyfr(liczba)>n)
           {n=funkcje.sumacyfr(liczba); liczbamax=liczba;}
        }
        zapis.println("a) "+a);
        zapis.println("c) ");
        zapis.println("d) ");
        zapis.close();
    }
}