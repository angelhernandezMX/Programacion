import java.util.Scanner;
public class Problema_4{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa la base del triangulo rectangulo y radio");
    double R = input.nextDouble();
    System.out.println("Ingresa la hipotenusa del triangulo");
    double A = input.nextDouble();
    double cat = ((A*A)-(R*R));
    float C =  (float) Math.sqrt(cat);

    double AT = ((R*C)/2) * 2;
    double AC = 3.1416 * R;
    double areat = AT+AC;

    System.out.println("El area de tu figura es de: " + C);
  }
}
