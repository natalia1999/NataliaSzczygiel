import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 public class Zad1{
    public static void main(String[] args)
        throws FileNotFoundException{
            
            File file=new File("cyfry.txt");
            Scanner in=new Scanner(file);
            
            while(in.hasNextLine())
            {String text=in.nextLine();
            int a=Integer.parseInt(text);
            if (a%2==0)
            System.out.println(a);
            }
        }
 }
