import java.util.Scanner;
 public class Ejer06 {
   public static void main (String[] args){
     System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
     System.out.println("Mi Nombre:juan sebastian roa salamanca");
     System.out.println("      ingenieria en sistemas          ");
     System.out.println("      taller algebrin 01              ");
     System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

     double valorh,horast,salario;
     String nombre;

     Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese nombre del empleado: ");
     nombre = leer.next();
     System.out.print("Ingrese el valor hora: ");
     valorh = leer.nextFloat();
     System.out.print("ingrese horas trabajadas: ");
     horast = leer.nextFloat();

     salario=valorh*horast;

     System.out.println("el salario es: "+salario);
      }
  }
