import java.util.Scanner;
 public class Ejer05 {
   public static void main (String[] args){
     System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
     System.out.println("Mi Nombre:juan sebastian roa salamanca");
     System.out.println("      ingenieria en sistemas          ");
     System.out.println("      taller algebrin 01              ");
     System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

     double costoA,dinero,devo;


     Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese el costo del articulo: ");
     costoA = leer.nextFloat();
     System.out.print("ingrese el pago del cliente: ");
     dinero = leer.nextFloat();


     devo=dinero-costoA;

     System.out.println("el cambio: "+devo);
       }
  }
