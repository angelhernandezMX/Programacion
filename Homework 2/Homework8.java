import java.util.Scanner;
public class Homework8{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de alumnos a viajar: ");
    int NA = input.nextInt();

    if (NA >= 100) {
      double PA = (NA*65);
      System.out.println("El total a pagar es: " + PA);
    }
    if (NA >= 50 && NA <= 99 ) {
      double PA = (NA*70);
      System.out.println("El total a pagar es: " + PA);
    }
    if (NA >= 30 && NA <= 49) {
      double PA = (NA*95);
      System.out.println("El total a pagar es: " + PA);
    }
    else {
      System.out.println("El total a pagar es: 4000" );
    }
  }
}
