import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner in= new Scanner(System.in);
    
  System.out.println( "Podaj pierwszą liczbe calkowita");
   int liczba1=in.nextInt();
    System.out.println( "Podaj druga liczbe calkowita");
    int liczba2=in.nextInt();
    System.out.println( "Podaj 3 liczbe calkowita");
    int liczba3=in.nextInt();
    
    //int max=0;
    //if (liczba1>max)
   // {
    //  max=liczba1;
    //}
    //  if (liczba2>liczba1)
    //{
     // max=liczba2;
    //}
     //  if (liczba3>liczba2)
   // {
      //max=liczba3;
    //}

    int max=Math.max(liczba1,liczba2);
    if (max<=liczba3) {
      max=liczba3;
    }

    System.out.println(max);  
   // System.out.println(max);
  }
}