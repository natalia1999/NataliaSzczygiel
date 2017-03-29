import java.util.Scanner;

public class Zad1{
        
    String DecToBin(int d){
    String text = "";
     while(d>0){
        text=text + (char)(d%2 + 48);     
        d=d/2;
        }
        String reverse = new StringBuffer(text).reverse().toString(); 
        return reverse;
    }
    int Ile(int k){
        int S = 0;
        int a = k;
        for(int i=0; i<k; i++){
            if(a%10 == 1){
              S=S+1;                
        }
            a=a/10;
    }
        return S;
}
        
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Zad1 funkcje = new Zad1();
        System.out.println("Podaj czas w sekundach: ");
        int d = in.nextInt();
        int k = Integer.parseInt(funkcje.DecToBin(d));
        System.out.println("Czas w systemie binarnym: " + k + ". Ilość jedynek: " + funkcje.Ile(k));
        
        
    }
}