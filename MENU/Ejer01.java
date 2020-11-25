 import java.util.Scanner;
  public class Ejer01 {
    public static void main (String[] args){
      System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
      System.out.println("Mi Nombre:juan sebastian roa salamanca");
      System.out.println("      ingenieria en sistemas          ");
      System.out.println("      taller algebrin 01              ");
      System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

      float n,total;

      Scanner leer = new Scanner(System.in);
      System.out.print("Ingrese el numero para totalizar el cubo: ");
      n = leer.nextFloat();

      total= (float)Math.pow(n, 3);

      System.out.print("El valor del cubo es: "+total);
  }
}
