import java.util.Scanner;
 public class Ejer08 {
   public static void main (String[] args){
     System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
     System.out.println("Mi Nombre:juan sebastian roa salamanca");
     System.out.println("      ingenieria en sistemas          ");
     System.out.println("      taller algebrin 01              ");
     System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

     double diast,valorh,horast,horasex,seguro,salarion,salario,horas,totalhora=48;
     String nombre;

     Scanner leer = new Scanner(System.in);

     System.out.println("Este ciclo solo aplica para 15 dias");
     System.out.print("Ingrese nombre del empleado: ");
     nombre = leer.next();
     System.out.print("Ingrese los dias trabajados: ");
     diast = leer.nextFloat();
     System.out.print("ingrese valor de la hora : ");
     valorh = leer.nextFloat();
     System.out.print("ingrese horas trabajadas: ");
     horast = leer.nextFloat();

     horas=horast-totalhora;

     if (horas>0) {
         horasex=horas*(valorh/2);
         salarion=horast*valorh;
         seguro=salarion*0.12;
         salario=horasex+(salarion-seguro);

     } else {
         salarion=horast*valorh;
         seguro=salarion*0.12;
         salario=salarion-seguro;

     }

     System.out.println("el salario es: "+salario);
      }
  }
