import java.util.Scanner;
public class Problema_2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa el radio de la circunferencia");
    double R = input.nextDouble();
    double PI = 3.1416;
    double area = (PI * (R*R));

    System.out.println("El area de la circunferencia es: " + area);


  }
}
