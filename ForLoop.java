import javax.swing.JOptionPane;
public class ForLoop{
  public static void main(String[] args) {
    int quest = 0;
    do{
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa que tabla quieres ver:"));
    String salida = "";

    for (int i = 0; i <= 10  ; i++ ) {
      int m = n * i;
      //JOptionPane.showMessageDialog(null,"1 x" + i + "=" + m);

      salida += "1 x " + i + "=" + m + "\n";
    }
    JOptionPane.showMessageDialog(null, salida);
    quest = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas buscar otra tabla? \n"+ "Presiona 0 Si quieres \n" + "Presiona 1 Si NO quieres"));
    }
    while (quest != 0);


  }
}
