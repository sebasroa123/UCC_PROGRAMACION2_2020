import java.util.Scanner;
 public class Ejer02 {
   public static void main (String[] args){
     System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
     System.out.println("Mi Nombre:juan sebastian roa salamanca");
     System.out.println("      ingenieria en sistemas          ");
     System.out.println("      taller algebrin 01              ");
     System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

     float n1,n2,prom,suma,resta,producto;

     Scanner leer = new Scanner(System.in);
     System.out.print("Ingrese el primer numero: ");
     n1 = leer.nextFloat();
     System.out.print("Ingrese el segundo numero: ");
     n2 = leer.nextFloat();

     suma=n1+n2;
     resta=n1-n2;
     prom=(n1+n2)/2;
     producto=n1*n2;

     System.out.println("El valor de la suma es: "+suma);
     System.out.println("El valor de la resta es: "+resta);
     System.out.println("El valor del producto es: "+producto);
     System.out.println("El valor del promedio es: "+prom);
 }
}
