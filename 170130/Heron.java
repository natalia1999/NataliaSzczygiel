import java.util.Scanner;
public class Heron{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double H;
        System.out.println("Podaj boki trójkąta: ");
        System.out.print("a: ");
        double a=in.nextDouble();
        System.out.print("b: ");
        double b=in.nextDouble();
        System.out.print("c: ");
        double c=in.nextDouble();
         
         if (a +b > c && a+c>b && a+c >a)
         {  System.out.println("Da się zbudować trójkąt");
             double p;
             p=(a+b+c)/2;
             H=Math.sqrt(p*(p-a)*(p-b)*(p-c));
             System.out.format("Pole trójkąta wynosi "+"%.2f%n", H);
         }
         else
         System.out.println("Nie da się zbudować trójkąta");
    }
}