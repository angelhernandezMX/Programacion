import javax.swing.JOptionPane;

public class H2JOption2 {
  public static void main(String[] args) {
    int NUM = Integer.parseInt(JOptionPane.showInputDialog(null, "Inser the number."));
  String R;
    if (NUM < 0)
      R = "NEGATIVE";
    else {
      R = "POSITIVE";
    }
    JOptionPane.showMessageDialog(null, "The number is " + R);
  }
}
