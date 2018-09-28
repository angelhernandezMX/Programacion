import javax.swing.JOptionPane;

public class GuessBirthdayJOpane{
  public static void main(String[] args) {
    String Set1 = "1 3 5 7  \n" +
                  "9 11 13 15 \n" +
                  "17 19 21 23 \n" +
                  "25 27 29 31 \n";
    String Set2 = "2 3 6 7 \n" +
                  "10 11 14 15 \n" +
                  "18 19 22 23 \n" +
                  "26 27 30 31 \n";
   String Set3 = "4 5 6 7 \n" +
                 "12 13 14 15 \n" +
                 "20 21 22 23 \n" +
                 "28 29 30 31 \n";
   String Set4 = "8 9 10 11 \n" +
                  "12 13 14 15 \n" +
                  "24 25 26 27 \n" +
                  "28 29 30 31 \n";
   String Set5 = "16 17 18 19 \n" +
                 "20 21 22 23 \n" +
                 "24 25 26 27 \n" +
                 "28 29 30 31";

  int day = 0;
  int answer = JOptionPane.showConfirmDialog(null,
              "Is your birthday in: Set 1? \n" + Set1);

  if (answer == JOptionPane.YES_OPTION) {
    day+=1;
      }

      answer = JOptionPane.showConfirmDialog(null,
                  "Is your birthday in: Set 2? \n" + Set2);

      if (answer == JOptionPane.YES_OPTION) {
        day+=2;
      }
     answer = JOptionPane.showConfirmDialog(null,
                  "Is your birthday in: Set 3? \n" + Set3);

      if (answer == JOptionPane.YES_OPTION) {
        day+=4;
      }
     answer = JOptionPane.showConfirmDialog(null,
                  "Is your birthday in: Set 4? \n" + Set4);

        if (answer == JOptionPane.YES_OPTION) {
          day+= 8;
        }

     answer = JOptionPane.showConfirmDialog(null,
                    "Is your birthday in: Set 5? \n" + Set5);

          if (answer == JOptionPane.YES_OPTION) {
          day+= 16;
          }

      JOptionPane.showMessageDialog(null,
                      "Your birthday is: \n" + day);

  }
}
