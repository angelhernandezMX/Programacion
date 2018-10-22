import javax.swing.*;
public class CourseImpl{
  public static void main(String[] args) {

    do{

      switch(opc){
        case 1:
        //crear curso1
        break;
        case 2:
        //crear curso2
        break;
        case 3:
        //eliminar estudiantes
        break;
        case 4:
        //mostrar estudiantes
        break;
        case 5:
        //mostrar estudiantes
        break;
        default:
        //Mensaje de elija opcion
      }

    }while(true);


    Course curso1 = new Course();
    //curso1.courseName = "Ingles";
    curso1.setCourseName("Ingles");

    curso1.addStudent("Luis Alberto");
    curso1.addStudent("Angel");
    curso1.addStudent("Jorge");


    String [] studentsDeIngles = curso1.getStudents();
    String students = "";
    for (int i = 0; i < curso1.getNumberOfStudents(); i++) {
     students += studentsDeIngles[i] + "\n";
    }


    JOptionPane.showMessageDialog(null, students);

    curso1.dropStudent("Angel");

    studentsDeIngles = curso1.getStudents();
    students = "";
    for (int i = 0; i < curso1.getNumberOfStudents(); i++) {
     students += studentsDeIngles[i] + "\n";
    }

    JOptionPane.showMessageDialog(null, students);

    Course curso2 = new Course();
    curso2.setCourseName("Mate");
    curso2.addStudent("Maria");
    curso2.addStudent("Karen");
    curso2.addStudent("Kevin");

    JOptionPane.showMessageDialog(null, curso1.getCourseName());

    Course curso3 = new Course("Programacion");

    curso.addStudent("Agustin");
    curso3.addStudent("Juan Carlos");
    curso4.addStudent("You");



  }
}
