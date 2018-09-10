import java.util.Scanner;
public class Problema_5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de leche que produce");
    double L = input.nextDouble();
    System.out.println("Ingresa el precio del galon");
    double PG = input.nextDouble();


    double TG = L/3.785;
    double GA = PG*TG;

    System.out.println("Tu ganancia es de: " + GA + "pesos");
  }
}
