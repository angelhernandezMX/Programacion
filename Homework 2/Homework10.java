import java.util.Scanner;
public class Homework10{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa el numero de consulta:");
    int NC = input.nextInt();

    if (NC <= 3) {
      int CC = 200;
      double CT = CC*NC;
      System.out.println("El pago por esta cita es de: " + CC);
      System.out.println("El costo total es de: " + CT);
    }
    if (NC > 3 && NC <= 5) {
      double C = NC-3;
      double CC = 150;
      double CT = (CC*C) + 600;
      System.out.println("El pago por esta cita es de: " + CC);
      System.out.println("El costo total es de: " + CT);
    }
    if (NC > 5 && NC <= 8) {
      double C = NC-5;
      double CC = 100;
      double CT = (CC*C) + 900;
      System.out.println("El pago por esta cita es de: " + CC);
     System.out.println("El costo total es de: " + CT);
    }
    else {
      double C = NC-8;
      double CC = 50;
      double CT = (CC*C) + 1200;
      System.out.println("El pago por esta cita es de: " + CC);
      System.out.println("El costo total es de: " + CT);
    }
  }
}
