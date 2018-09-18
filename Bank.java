import java.util.Scanner;
public class Bank {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Menciona que tipo de tarjeta usa: \n" +
                        "Si usa Tipo 1 escriba: 1 \n"+
                        "Si usa Tipo 2 escriba: 2 \n"+
                        "Si usa Tipo 3 escriba: 3 \n"+
                        "Si usa otro tipo escriba: 0 \n");
   int TT = input.nextInt();

   System.out.println("Ingrese el limite actual de su credito:");
   double LA = input.nextDouble();

      if (TT == 1){
      double AC = LA * 0.25;
      double NC = AC + LA;
      System.out.println("Su limite de credito aumento un 25%");
      System.out.println("Su nuevo limite es de: " + NC);
    }
      if (TT == 2){
      double AC = LA * 0.35;
      double NC = AC + LA;
      System.out.println("Su limite de credito aumento un 35%");
      System.out.println("Su nuevo limite es de: " + NC);
    }
      if (TT == 3){
      double AC = LA * 0.40;
      double NC = AC + LA;
      System.out.println("Su limite de credito aumento un 40%");
      System.out.println("Su nuevo limite es de: " + NC);
    }
      if (TT == 0){
      double AC = LA * 0.50;
      double NC = AC + LA;
      System.out.println("Su limite de credito aumento un 50%");
      System.out.println("Su nuevo limite es de: " + NC);
    }



   }
}
