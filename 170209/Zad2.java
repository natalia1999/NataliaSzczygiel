import java.io.FileNotFoundException;
import java.io.PrintWriter;

 public class Zad2{
    public static void main(String[] args)
        throws FileNotFoundException{
            PrintWriter zapis=new PrintWriter("zadanie4.txt");
            
            zapis.println("a)  495");
    
            zapis.close();
            
        }
     
 }
        