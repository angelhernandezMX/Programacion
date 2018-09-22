import java.util.Scanner;
public class Homework4{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese el costo del traje");
    double CT = input.nextInt();

    if (CT >= 2500) {
      double DE = CT*0.15;
      double PF = CT-DE;
      System.out.println("El total a pagar es de: " + PF);
    }
    else {
      double DE = CT*0.08;
      double PF = CT-DE;
      System.out.println("El total a pagar es de: " + PF);
    }
  }
}
