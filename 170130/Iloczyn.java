public class Iloczyn{
    public static void main(String[] args){
      if(args.length!=0) 
      { double a = Double.parseDouble(args[0]);
          for(int i=1; i<args.length; i++)
          { double b = Double.parseDouble(args[i]);
            a=a*b;
          }
          System.out.println("Iloczyn wszystkich podanych liczb wynosi: "+a);
       } else 
        System.out.println("BŁĄD DANYCH");
    }
}