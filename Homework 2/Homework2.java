import java.util.Scanner;
public class Homework2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa cualquier numero: ");
    int NUM = input.nextInt();

    if (NUM > 0) {
      String R = "El numero es positivo";
      System.out.println("El resultado es: " + R);
    }
    else {
      String R = "El numero es negativo";
      System.out.println("El resultado es: " + R);
    }
  }
}
