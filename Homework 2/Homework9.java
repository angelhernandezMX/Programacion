import java.util.Scanner;
public class Homework9{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese el tiempo de la llamada: ");
    double TI = input.nextInt();
    System.out.println("Ingrese en que dia lo realizo: \n"+
                       "Si fue en dia domingo marque 0 \n"+
                       "Si fue en dia habil marque 1 \n");
    int DI = input.nextInt();
    System.out.println("Ingrese en que turno realizo la llamada: \n"+
                        "Si fue en la mañana marque 0 \n"+
                        "Si fue en la tarde marque 1");
    int TU = input.nextInt();

    if ((TI<5 && DI == 1) && TU == 0) {
      double PAG = TI*1.00;
      double IMP = PAG*0.15;
      double TOT = PAG+IMP;
      System.out.println("El pago total por la llamada es de: " + TOT);
    }
    else {
      double PAG = TI*1.00;
      double IMP = PAG*0.03;
      double TOT = PAG+IMP;
      System.out.println("El pago total por la llamada es de: " + TOT);
    }
    if ((TI<8 && DI == 1) && TU == 0) {
      double PAG = TI*0.80;
      double IMP = PAG*0.15;
      double TOT = PAG+IMP;
      System.out.println("El pago total por la llamada es de: " + TOT);
    }
    else {
      double PAG = TI*0.80;
      double IMP = PAG*0.03;
      double TOT = PAG+IMP;
      System.out.println("El pago total por la llamada es de: " + TOT);
    }
  }
}
