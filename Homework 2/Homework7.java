import java.util.*;
public class Homework7{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa el tipo de uva a vender: ");
    String TI = input.next();
    System.out.println("Ingresa el tamaño de uva a vender: ");
    int TA = input.nextInt();
    System.out.println("Ingresa el precio de la uva: ");
    double P = input.nextDouble();
    System.out.println("Ingresa los kilos a vender: ");
    int K = input.nextInt();

    if ((TI.equals("A")) && (TA == 1)) {
      double PR = P+0.20;
      double GA = K*PR;
      System.out.println("La ganancia obtenida es de: " + GA);
    }
   if ((TI.equals("A")) && (TA == 2)) {
      double PR = P+0.30;
      double GA = K*PR;
      System.out.println("La ganancia obtenida es de: " + GA);
    }
   if ((TI.equals("B")) && (TA == 1)) {
      double PR = P-0.50;
      double GA = K*PR;
      System.out.println("La ganancia obtenida es de: " + GA);
    }
   if ((TI.equals("B")) && (TA == 2)) {
      double PR = P-0.30;
      double GA = K*PR;
      System.out.println("La ganancia obtenida es de: " + GA);
    }


    }
  }
