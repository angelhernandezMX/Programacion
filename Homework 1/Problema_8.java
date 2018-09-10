import java.util.Scanner;
public class Problema_8{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la altura de la alberca");
    double A = input.nextDouble();
    System.out.println("Ingresa el largo de la alberca");
    double L = input.nextDouble();
    System.out.println("Ingresa el ancho de la alberca");
    double N = input.nextDouble();
    System.out.println("Costo del metro cubico:");
    double CM = input.nextDouble();

    double V = A*L*N;
    double PAG = CM*V;

    System.out.println("El pago a realizar es de: " + PAG + "pesos");
  }
}
