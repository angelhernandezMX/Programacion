import javax.swing.JOptionPane;
public class ForLoop{
  public static void main(String[] args) {
    int quest;
    do{
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa que tabla quieres ver:"));
    String salida = "";

    for (int i = 0; i <= 10  ; i++ ) {
      int m = n * i;
      //JOptionPane.showMessageDialog(null,"1 x" + i + "=" + m);

      salida += n + "x" + i + "=" + m + "\n";
    }
    JOptionPane.showMessageDialog(null, salida);
    quest = JOptionPane.showConfirmDialog(null, "¿Deseas buscar otra tabla? \n"+ "Presiona Si \n" + "Presiona NO ");
    }
    while (quest == JOptionPane.YES_OPTION);


  }
}
