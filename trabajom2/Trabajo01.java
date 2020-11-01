import java.util.Scanner;
public class Trabajo01 {
  public static void main (String[] args){
    int l1,l2;
    boolean tr1=false,tr2=false,k;

    Scanner leer = new Scanner(System.in);

    System.out.print("¿La tierra es redonda [0]...Falso [1]...Verdad? ");
    l1 = leer.nextInt();
    System.out.print("¿25 es un cuadrado perfecto [0]...Falso [1]...Verdad? ");
    l2 = leer.nextInt();

    if (l1!=0) tr1=true;
    if (l2!=0) tr2=true;

    k= tr1 && tr2;

      System.out.print("El valor de la variable k es: "+k);
  }
}
