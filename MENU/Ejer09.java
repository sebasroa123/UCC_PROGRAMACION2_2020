import java.util.Scanner;
public class Ejer09 {
public static void main(String elMago[]) {
  System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
  System.out.println("Mi Nombre:juan sebastian roa salamanca");
  System.out.println("      ingenieria en sistemas          ");
  System.out.println("      taller algebrin 01              ");
  System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

        Scanner lector = new Scanner(System.in);

        int numero, sumDig = 0;

        System.out.print("Ingrese un numero ");

        numero = lector.nextInt();

        int aux=numero;

        while (numero != 0) {

            sumDig = sumDig + (numero % 10);

            numero = numero / 10;

        }

        System.out.println("La suma de los digitos de " + aux + " es: " + sumDig);



    }

}
