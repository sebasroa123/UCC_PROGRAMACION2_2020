public class Ejer00 {
  public static void main (String[] args){
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("Mi Nombre:juan sebastian roa salamanca");
    System.out.println("      ingenieria en sistemas          ");
    System.out.println("      taller algebrin 01              ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

    int longitud=12,tramo=2,dias=0,resTela;

    resTela=longitud;
    while(resTela>tramo){
      resTela-=tramo;
      dias+=1;
    }

      System.out.println("La cantidad de dias son: "+dias);
  }
}
