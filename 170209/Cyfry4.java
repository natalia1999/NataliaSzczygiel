import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

 public class Cyfry4{
     
 public static void main(String[] args) 
        throws FileNotFoundException {
        PrintWriter zapis=new PrintWriter("zadanie4.txt");
        File cyfry = new File( "cyfry.txt" );
        Scanner in = new Scanner( cyfry );
        int[] Tc = new int[ 1000 ];
        String L;
        int i = 0;
        while( in.hasNextLine() ) {
            L = in.nextLine();
            Tc[ i ] = Integer.parseInt( L );
            i++;
        }
        System.out.println( "A)" );
        int p = 0;
        for( i = 0; i <= 999; i++ ) {
            if( Tc[ i ] % 2 == 0 ) {
                p++;
            }
        }
        System.out.println( "Liczb parzystych jest " + p );
         zapis.println("zadanie 4");
         zapis.println("a) "+p);
       
       
       
       
        System.out.println( "B)" );
        int[] a = new int[ 1000 ];
        int digit;
        int[] Ts = new int[ 1000 ];
        int suma = 0;
        for( i = 0; i < 999; i++ ) {
            a[ i ] = Tc[ i ];
            while( a[ i ] > 0 ) {
                digit = a[ i ] % 10;
                a[ i ] = a[ i ] / 10;
                suma = suma + digit;
            }
            Ts[ i ] = suma;
            suma = 0;
        }
        int value;
        int j = 0;
        for( i = 1; i < 1000; ++i ) {
            value = Ts[ i ];
            for( j = i - 1; j >= 0 && Ts[ j ] > value; --j ) {
                Ts[ j + 1 ] = Ts[ j ];
            }
            Ts[ j + 1 ] = value;
        }
        int[] b = new int[ 1000 ];
        int digit2;
        int suma2 = 0;
        int min = 0;
        int max = 0;
        for( i = 0; i < 999; i++ ) {
            b[ i ] = Tc[ i ];
            while( b[ i ] > 0 ) {
                digit2 = b[ i ] % 10;
                b[ i ] = b[ i ] / 10;
                suma2 = suma2 + digit2;
            }
            if( suma2 == Ts[ 1 ] ) min = i;
            if( suma2 == Ts[ 999 ] ) max = i;
            suma2 = 0;
        }
        System.out.println( "Liczba o największej sumie cyfr to: " + Tc[ min ] );
        System.out.println( "Liczba o najmniejszej sumie cyfr to: " + Tc[ max ] );
        zapis.print("b) ");
        zapis.println("Liczba o największej sumie cyfr to: " + Tc[ min ] );
        zapis.println("   Liczba o najmniejszej sumie cyfr to: " + Tc[ max ] );
       
        System.out.println( "C)" );
        int[] c = new int[ 1000 ];
        int digit3;
        int[][] liczby = new int[ 1000 ][ 100 ];
        
        for( i = 0; i < 1000; i++ ) {
            c[ i ] = Tc[ i ];
         
            
            }
            zapis.print("c) ");
          zapis.close();
            
        }
        
    }
    
 