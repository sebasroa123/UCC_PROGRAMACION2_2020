import java.util.Scanner;
 public class Ejer04 {
   public static void main (String[] args){
     System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
     System.out.println("Mi Nombre:juan sebastian roa salamanca");
     System.out.println("      ingenieria en sistemas          ");
     System.out.println("      taller algebrin 01              ");
     System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

     double salario,descuento,valorf;
     String nombre;

     Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese nombre del empleado: ");
     nombre = leer.next();
     System.out.print("Ingrese el salario: ");
     salario = leer.nextFloat();
     System.out.print("ingrese el descuento: ");
     descuento = leer.nextFloat();


     valorf=salario-descuento;

     System.out.println("el valor final: "+valorf);
      }
  }
