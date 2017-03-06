import java.util.Random;
import java.util.Arrays;

public class funkcje3{
    int [] losowa(){
        int[] T= new int[10];
        Random rand=new Random();
        for(int i=0; i<10 ; i++)
        { T[i]=rand.nextInt(101)+0;}
        return T;
    } 
      void pierwsza(int[] T ) {
          boolean pierwsza=true;
for(int i=0; i<T.length; i++){
    for (int j=2; j*j<T.length; j++)
    if(T[i]%j==0)
    pierwsza=false;
    else
    pierwsza = true;
    if(pierwsza)
   System.out.println(T[i] +" liczba pierwsza");
  else
   System.out.println(T[i] +" liczba złożona");
}
    }
    public static void main (String[] args){
   funkcje3 funkcja=new funkcje3();
       funkcja.pierwsza(funkcja.losowa());

    }
}