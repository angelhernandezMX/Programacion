import java.util.Scanner;
public class Homework3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de lapices a comprar: ");
    int X = input.nextInt();

    if (X >= 1000) {
      double PAG = X*0.85;
      System.out.println("El total a pagar es: " + PAG);
    }
    else {
      double PAG = X*0.90;
      System.out.println("El total a pagar es: " + PAG);
    }
  }
}
