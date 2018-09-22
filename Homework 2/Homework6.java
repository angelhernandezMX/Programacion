import java.util.Scanner;
public class Homework6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de personas: ");
    int NP = input.nextInt();

    if (NP > 200 && NP <= 300) {
      double TOT = NP*85.00;
      System.out.println("El total a pagar es: " + TOT);
    }
    else if (NP > 300) {
      double TOT = NP*75.00;
      System.out.println("El total a pagar es: " + TOT);
    }
    else {
      double TOT = NP*95.00;
      System.out.println("El total a pagar es: " + TOT);
    }
  }
}
