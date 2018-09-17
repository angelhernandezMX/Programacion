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
    // double IMC = weightink / Math.pow (heightinm, 2);

    System.out.println("Your BMI is: " + IMC);
    
    if (IMC < 16)
      System.out.println("Your are very seriously underweight");
    else if (IMC < 18)
      System.out.println("Your are underweight");
    else if (IMC < 24)
      System.out.println("Your are normal weight");
    else if (IMC < 29)
      System.out.println("Your are overweight");
    else if (IMC < 35)
      System.out.println("Your are seriously overweight");
    else
      System.out.println("Your are gravely overweight");
  }
}
