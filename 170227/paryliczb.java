import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

 public class paryliczb{
    
    int NWD(int a, int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    } 
    
    int sumacyfr(int n){
        int s=0;
        while(n>0){
            s=s+(n%10);
            n=n/10;
        }
        return s;
    }
 
 public static void main(String[] args)throws FileNotFoundException{
      PrintWriter zapis=new PrintWriter("zadanie5.txt");
    paryliczb funkcje = new paryliczb(); 
    File file = new File ("PARY_LICZB.TXT");
    Scanner in = new Scanner(file);
    zapis.println("zadanie 5");
    int liczba1=0; 
    int liczba2=0;
    int i=0;
    int d=0;
            for(int j=0; j<1000; j++){
            liczba1 = in.nextInt();
            liczba2 = in.nextInt();
            if(liczba1%liczba2==0 || liczba2%liczba1==0){
            i++;}
    }
    zapis.println("a) "+i);
            
            for(int k=0; k<1000; k++){
        
            if(funkcje.NWD(liczba1,liczba2)==1)
            d++;
            }
            zapis.println("b) "+d);
            
        zapis.close();
    }
 }