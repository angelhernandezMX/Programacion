import java.util.Scanner;
public class Problema_6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Numero de horas trabajadas:");
    double HT = input.nextDouble();
    System.out.println("Pago por hora:");
    double PH = input.nextDouble();
    double SS = PH*HT;


    System.out.println("Tu ganancia semanal es de: " + SS + "pesos");
  }
}
