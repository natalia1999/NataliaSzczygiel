
public class funkcje1 {
    public void pierwsza(int a ) {
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
   funkcje1 Funkcja=new funkcje1();
    int a= Integer.parseInt(args[0]);
    Funkcja.pierwsza(a);
       
            
        
    }
}