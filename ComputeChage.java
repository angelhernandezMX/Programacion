import java.util.Scanner;
public class ComputeChage{
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
    System.out.println("Enter an amount in double");
    double amount = input.nextDouble();

    int cents = (int)(amount * 100);
    // numbers of cents
    int numberOfDollars = cents/100;
    cents =  cents%100;
    //numbers of quarters
    int quarters = cents/25;
    cents = cents%25;
    // numbers of dimes
    int dimes = cents/10;
    cents = cents%10;
    //numbers of nickels
    int nickels = cents/5;
    cents = cents%5;
    //numbers of pennies
    int pennies = cents;

  //imprimir

  System.out.println("Your amount "+ amount + " consist of \n " +
  "\t" + numberOfDollars + " dollars"+
   "\t" + quarters + " quarters" +
   "\t" + dimes + " dimes" +
   "\t" + nickels + " nickels" +
   "\t" + pennies + " pennies" );
  }
}
