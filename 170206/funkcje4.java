
import java.util.Scanner;

public class funkcje4{
    void Cyfry( int a){
        int wynik=0;
        do{

        wynik = a%10;
        System.out.print(wynik+ ", ");
        a /= 10;
        
        }while (a != 0);

    }

    public static void main (String[] args){
      Scanner in=new Scanner(System.in);
        funkcje4 funkcje=new funkcje4();
 System.out.println("Podaj liczbę");
       int a =in.nextInt();
            funkcje.Cyfry(a);
        
    }
}