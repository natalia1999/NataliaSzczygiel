import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Zad2{
    int BinToDec(String t){
        double k=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)== '1'){
            k=k+ Math.pow(2,t.length()-1-i);
     }

    }
    return (int) k;
        }
    
    public static void main(String [] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj cenę w systemie dwojkójkowym:");
        Zad2 funkcje = new Zad2();
        String s=in.nextLine();
        Double f=0.0;
        char a=s.charAt(s.length()-2);
        char d=s.charAt(s.length()-1);
        if(a=='1' && d=='1')f=0.75;
        else if(a=='1' && d=='0')f=0.50;
        else if(a=='0' && d=='1')f=0.25;
        String p = s.substring(0, s.length()-3);
        int liczba = funkcje.BinToDec(p);
        Double w=liczba+f;
        System.out.println("Cena w systemie dziesiętnym: "+w);
        

    }
}