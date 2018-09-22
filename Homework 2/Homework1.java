import java.util.Scanner;
public class Homework1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa el primer valor");
    int A = input.nextInt();
    System.out.println("Ingresa el segundo valor");
    int B = input.nextInt();

    if (A>B) {
      String R = "A es el mayor";
      System.out.println("El resultado es: " + R);
    }
    else {
      String R = "B es el mayor";
      System.out.println("El resultado es: " + R);
    }

    
  }
}
