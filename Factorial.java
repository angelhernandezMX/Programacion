import javax.swing.JOptionPane;
public class Factorial{
  public static void main(String[] args) {
    //Numero para el limite del Factorial
    int value = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un valor", "Calcular Factorial"));

    //Numero del Factorial
    int fact = 1;
    //Sentinel
    int i =1;

    while (i <= value ) {

      fact = fact * i;
      i++;
    }

    JOptionPane.showMessageDialog(null, "El Factorial de " + value + " es " + fact, "Calcular Factorial", JOptionPane.WARNING_MESSAGE);
  }

}
