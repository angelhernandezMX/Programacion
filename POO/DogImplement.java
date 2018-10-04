import javax.swing.JOptionPane;

public class DogImplement{
  public static void main(String[] args) {
    Dog firulais = new Dog();
    firulais.color= "black";
    firulais.eyeColor="blue";
    firulais.height= 0.50d;
    firulais.weight= 30.0d;


    Dog chilaquil = new Dog();
    chilaquil.color="brown";
    chilaquil.eyeColor="green";
    chilaquil.height=0.78d;
    chilaquil.weight = 25.0d;

    JOptionPane.showMessageDialog(null,"Firulais es de color: " + firulais.color);
    JOptionPane.showMessageDialog(null,"Chilaquil es de color: " + chilaquil.color);

    System.out.println(firulais.sit());
    firulais.sit();
    String perro = JOptionPane.showInputDialog("Escribe el nombre del perro:");
    firulais.layDown(perro);
    firulais.sleep();

  }
}
