import java.util.Scanner;
public class Ejer07 {
  public static void main (String[] args){
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("Mi Nombre:juan sebastian roa salamanca");
    System.out.println("      ingenieria en sistemas          ");
    System.out.println("      taller algebrin 01              ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    int tiempo=30,paginas=15;
    double resultado;

    resultado=2*60/tiempo*paginas;
    System.out.println("El total de paginas digitadas en 2 horas son: "+resultado);

    resultado=75/paginas*tiempo;
    System.out.println("Las 75 paginas se digitaran en: "+resultado+ " minutos");

  }
}
