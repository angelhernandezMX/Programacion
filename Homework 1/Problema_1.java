import java.util.Scanner;
public class Problema_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la altura del rectangulo");
    double A = input.nextDouble();
    System.out.println("Ingresa la base del rectangulo");
    double B = input.nextDouble();
    double area = A*B;
    System.out.println("El area de tu rectangulo es de: " + area);
  }
}
