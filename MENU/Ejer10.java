import java.util.Scanner;
public class Ejer10 {
public static void main (String[] args){
     System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
     System.out.println("Mi Nombre:juan sebastian roa salamanca");
     System.out.println("      ingenieria en sistemas          ");
     System.out.println("      taller algebrin 01              ");
     System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");

     double codigo,horas,valorh,horast,horasex,salarion,salariot,totalhora=48;
     String nombre;

     Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese nombre del empleado: ");
     nombre = leer.next();
     System.out.print("ingrese el codigo : ");
     codigo = leer.nextFloat();
     System.out.print("ingrese valor de la hora : ");
     valorh = leer.nextFloat();
     System.out.print("ingrese horas trabajadas: ");
     horast = leer.nextFloat();

     horas=horast-totalhora;

     if (horas>0) {
         horasex=horas*valorh*0.20;
         salarion=horast*valorh;
         salariot=horasex+salarion;

     } else {
         salarion=horast*valorh;
         salariot=salarion;

     }

     System.out.println("el salario es: "+salariot);
      }
  }
