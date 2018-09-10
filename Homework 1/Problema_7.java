import java.util.Scanner;
public class Problema_7{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de tela en metros");
    double CM = input.nextDouble();

    double PG = CM/0.0254;
    System.out.println("La cantidad de pulgadas a pedir es de: " + PG );
  }
}
