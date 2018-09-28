import javax.swing.JOptionPane;
public class WhileLoop{
  public static void main(String[] args) {

    int number = (int)(Math.random() * 100);

    int guess = -1;
    //Mientras CONDICION
    while (guess != number) {
      guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a magic number between 0 and 100!" ));

      if (guess == number) {
        JOptionPane.showMessageDialog(null, "Yes, the number is: " + number);
      }
      else if ( guess > number) {
        JOptionPane.showMessageDialog(null, "Your guess is very high");
      }
      else if (guess < number) {
        JOptionPane.showMessageDialog(null, "Your guess is very low" );
      }
    }

  }
}
