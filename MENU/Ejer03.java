import java.util.Scanner;
 public class Ejer03 {
   public static void main (String[] args){
     System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
     System.out.println("Mi Nombre:juan sebastian roa salamanca");
     System.out.println("      ingenieria en sistemas          ");
     System.out.println("      taller algebrin 01              ");
     System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

     double n1,n2,n3,notaf;

     Scanner leer = new Scanner(System.in);
     System.out.print("Ingrese la primer nota: ");
     n1 = leer.nextFloat();
     System.out.print("Ingrese la segunda nota: ");
     n2 = leer.nextFloat();
     System.out.print("Ingrese la tercer nota: ");
     n3 = leer.nextFloat();

     n1=n1*0.3;
     n2=n2*0.3;
     n3=n3*0.4;
     notaf=n1+n2+n3;

     System.out.println("La nota final es: "+notaf);

 }
}
