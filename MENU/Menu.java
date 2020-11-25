import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class Menu {
public static void main(String[] args) {

  System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
  System.out.println(" mi Nombre:juan sebastian roa salamanca ");
  System.out.println(" ingenieria en sistemas ");
  System.out.println(" taller menu ");
  System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");


  int opcion;
  char otro;
  String comando="",ruta="E:\\menu\\";

Scanner leer = new Scanner(System.in);

do{
  System.out.println("1.ejercicio00");
System.out.println("2.ejercicio01");
System.out.println("3.ejercicio02");
System.out.println("4.ejercicio03");
System.out.println("5.ejercicio04");
System.out.println("6.ejercicio05");
System.out.println("7.ejercicio06");
System.out.println("8.ejercicio07");
System.out.println("9.ejercicio08");
System.out.println("10.ejercicio09");
System.out.println("11.ejercicio10");
System.out.println("12.ejercicio11");
System.out.println("13.ejercicio12");
System.out.println("14.ejercicio13");
System.out.println("15.ejercicio14");
opcion=leer.nextInt();


    switch (opcion){
  case 1:
  comando="Ejer00";
  break;
  case 2:
  comando="Ejer01";
  break;
  case 3:
  comando="Ejer02";
  break;
  case 4:
  comando="Ejer03";
  break;
  case 5:
  comando="Ejer04";
  break;
  case 6:
  comando="Ejer05";
  break;
  case 7:
  comando="Ejer06";
  break;
  case 8:
  comando="Ejer07";
  break;
  case 9:
  comando="Ejer08";
  break;
  case 10:
  comando="Ejer09";
  break;
  case 11:
  comando="Ejer10";
  break;
  case 12:
  comando="Ejer11";
  break;
  case 13:
  comando="Ejer12";
  break;
  case 14:
  comando="Ejer13";
  break;
  case 15:
  comando="Ejer14";
  break;
  }


    try
    {
        var processBuilder = new ProcessBuilder();
        processBuilder.command("java ","E:\\menu\\"+comando+".java");
        var process = processBuilder.inheritIO().start();
        var ret = process.waitFor();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
      System.out.print("Desea continuar con otro programa? (S o N) ");
      otro = leer.next().charAt(0);
    } while(otro=='s'||otro=='S');
  }
}
