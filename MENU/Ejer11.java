import java.util.Scanner;
public class Ejer11 {
  public static void main (String[] args){
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("Mi Nombre:juan sebastian roa salamanca");
    System.out.println("      ingenieria en sistemas          ");
    System.out.println("      taller algebrin 01              ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    
    double valorabs;

    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el numero para determinar el valor absoluto: ");
    valorabs = leer.nextFloat();

    if (valorabs<0) {
        valorabs*=(-1);
    }
      System.out.println("El valor absoluto es: "+valorabs);

  }
}
