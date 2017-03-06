import java.util.Scanner;

public class funkcje2{
    public void pierwsza(int a) {
          
     boolean pierwsza = true;

 for(int i=2;i*i<a;i++)
        if (a%i==0)
         pierwsza = false;
    if(pierwsza)
   System.out.println("liczba pierwsza");
  else
   System.out.println("liczba złożona");
     }
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
   funkcje2 funkcja=new funkcje2();
    int a;
    int b;
   do{System.out.println("Podaj liczbe i sprawdz czy jest liczbą pierwsza");
        a=in.nextInt();
       funkcja.pierwsza(a);
        do{System.out.println("Chcesz kontynouwać? Wciśnij 1, jeśli nie 0.");
            b=in.nextInt();
            }while (b!=1 && b!=0);
       
    }while(b==1);
  }
}
