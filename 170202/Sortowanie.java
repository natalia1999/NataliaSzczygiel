import java.util.Arrays;
import java.util.Random;

public class Sortowanie{
    public static void main (String[] args){
            Random rand = new Random();
        int [] T =new int[10];
         for(int i=0; i<10; i++)
         {
             T[i]= rand.nextInt(101)+0;
         }
         Arrays.sort(T); 
         System.out.println(Arrays.toString(T));
    }}