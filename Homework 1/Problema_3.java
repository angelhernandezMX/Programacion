import java.util.Scanner;
public class Problema_3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la base del rectangulo y del triangulo");
    double B = input.nextDouble();
    System.out.println("Ingresa la altura del rectangulo y triangulo juntos");
    double A = input.nextDouble();
    System.out.println("Ingresa solo la altura del rectangulo");
    double C = input.nextDouble();

    double AR = B*C;
    double alt = A-C;
    double AT = (alt*B)/2;
    double areat = AR + AT;

    System.out.println("El area de tu figura es de: " + areat);
  }
}
