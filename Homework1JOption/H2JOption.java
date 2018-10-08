import javax.swing.JOptionPane;

public class H2JOption {
  public static void main(String[] args) {

double R = Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte el radio de la circunferencia"));

  double PI = 3.1416;
  double area = PI * Math.pow(R,2);
JOptionPane.showMessageDialog(null,"El area de de la circunferencia es: " + area);
  }
}
