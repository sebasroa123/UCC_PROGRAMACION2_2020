import java.util.Scanner;
public class Ejer12 {
  public static void main (String[] args){
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("Mi Nombre:juan sebastian roa salamanca");
    System.out.println("      ingenieria en sistemas          ");
    System.out.println("      taller algebrin 01              ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    int metagusano=0,metacaracol=0,metaciempies=0;

    do{
        metagusano=metagusano+2;
        metaciempies=metaciempies+1;
        metacaracol=metacaracol+1;

        } while(metagusano<10 && metacaracol<10 && metaciempies<10);

        if (metaciempies==10) {
            System.out.println("El ganador es el Ciempies");

        }   else if (metacaracol==10) {

            System.out.println("El ganador es el Caracol");
          }else{
              System.out.println("El ganador es el Gusano");
          }
  }
}
