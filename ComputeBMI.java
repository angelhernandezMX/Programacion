import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double KILOGRAMS_PER_POUND = 0.453592;
    final double METERS_PER_INCH = 0.0254;

    System.out.println("Enter weight in pounds: ");
    double weight = input.nextDouble();

    System.out.println("Enter height in inches: ");
    double height = input.nextDouble();

    double weightink = weight * KILOGRAMS_PER_POUND;
    double heightinm = height * METERS_PER_INCH;

    double IMC = weightink / (heightinm*heightinm);

    if (IMC <= 18.5) {
      System.out.println("Peso Insuficiente");
    }
    if (IMC > 18.5 && IMC < 24.9) {
      System.out.println("Peso Normal");
    }
    if (IMC > 25 && IMC < 26.9) {
      System.out.println("Sobrepeso Grado I");
    }
    if (IMC > 27 && IMC < 29.9){
      System.out.println("Sobrepeso Grado II");
    }
  }
}
