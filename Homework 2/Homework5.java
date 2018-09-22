import java.util.Scanner;
public class Homework5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa el primer numero");
    int pri = input.nextInt();
    System.out.println("Ingresa el segundo numero");
    int seg = input.nextInt();
    System.out.println("Ingresa el tercer numero");
    int ter = input.nextInt();

    if (pri > seg && seg > ter)
    System.out.println("El orden de los numeros es: " + pri + "," + seg +", " + ter);
    else if (pri > seg && ter > seg)
    System.out.println("El orden de los numeros es: " + pri + "," + ter +", " + seg);
    else if (seg > pri && pri > ter)
    System.out.println("El orden de los numeros es: " + seg + "," + pri +", " + ter);
    else if (seg > pri && ter > pri)
    System.out.println("El orden de los numeros es: " + seg + "," + ter +", " + pri);
    else if (ter > seg && seg > pri)
    System.out.println("El orden de los numeros es: " + ter + "," + seg +", " + pri);
    else if (ter > seg && pri > seg)
    System.out.println("El orden de los numeros es: " + ter + "," + pri +", " + seg);


  }
}
