import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
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
    
   /* int malejąca(int q){
        boolean mal= true;
        int k=q.length;
        int[] T= new int[1000];
        for(int i=k; i<=0; i--)
        {if(T[i]>=T[i-1])
         mal = false;}
         if(mal)
         return q;
        
    }*/
        
     
    public static void main(String [] args) throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("powt.txt");
        File file = new File("cyfry.txt");
        Scanner in = new Scanner(file); 
        Pow1 funkcje = new Pow1();
        int a=0;
        int liczba=in.nextInt();
        int n=funkcje.sumacyfr(liczba);
        int liczbamax=liczba;
        zapis.println("c) ");         
        while(in.hasNextLine()){
           String text=in.nextLine();
           liczba=in.nextInt();
           
           if(liczba<10000)
           {zapis.println(liczba+"    "+funkcje.bin(liczba));}
           
           if(funkcje.sumacyfr(liczba)>n)
           {n=funkcje.sumacyfr(liczba); liczbamax=liczba;}
           
           if(liczba%2==0)
           a++;
           
          // zapis.println("        "+funkcje.malejąca(liczba));
        }
        zapis.println("a) "+a);
        zapis.println("b) "+ liczbamax);
        zapis.println("d) ");
        zapis.close();
    }
}