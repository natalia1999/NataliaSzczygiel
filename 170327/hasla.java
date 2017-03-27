import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class hasla{
     
 public static void main(String[] args) 
        throws FileNotFoundException {
        PrintWriter zapis=new PrintWriter("wzniki4a.txt");
        File file = new File( "hasla.txt" );
         Scanner in = new Scanner(file);  int i = 0;
      int lp=0;
      int ln=0;
      while( in.hasNextLine() ) {
      String haslo = in.nextLine();
      if (haslo.length()%2==0)
      lp++;
      else
      ln++;
    }
     zapis.println("Parzyste : "+lp+"  Nieparzyste : "+ln);
     zapis.close();
     PrintWriter zapis2=new PrintWriter("wzniki4b.txt");

   }
}