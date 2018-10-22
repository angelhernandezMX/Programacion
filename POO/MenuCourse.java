
import javax.swing.*;
public class MenuCourse{
 public static void main(String[] args) {
   int menu1;
   Course curso1 = new Course();
   Course curso2 = new Course();
   
   do{
     String menu = JOptionPane.showInputDialog(null,"Ingrese lo que quiere ver:");
     menu1 = Integer.parseInt(menu);

     switch(menu1){
       case 1:
       //crear curso1

       curso1.setCourseName(JOptionPane.showInputDialog(null, "Ingresa el nombre del curso"));
       break;
       case 2:
       //crear curso2

       curso2.setCourseName(JOptionPane.showInputDialog(null, "Ingresa el nombre del curso"));
       break;
       case 3:
       //eliminar estudiantes
       break;
       case 4:
       //mostrar estudiantes
       String [] studentsDeIngles = curso1.getStudents();
       String students = "";
       for (int i = 0; i < curso1.getNumberOfStudents(); i++) {
        students += studentsDeIngles[i] + "\n";
       }
       JOptionPane.showMessageDialog(null, students);
       break;
       case 5:
       //mostrar estudiantes
       curso1.getNumberOfStudents();

       break;
       default:
       //Mensaje de elija opcion
       JOptionPane.showMessageDialog(null,"Solo hay 4 opciones");
     }

   }while(menu1 <=5 || menu1 >6);






 }
}
