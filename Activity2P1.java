import javax.swing.JOptionPane;


public class Activity2P1{


        public static void main(String[] args) {

            int numBooks;

            String input1 = JOptionPane.showInputDialog("Please enter the number of books purchased from the book club : )");

            numBooks = Integer.parseInt(input1);


            if(numBooks >= 0)
                if(numBooks == 0)
                    JOptionPane.showMessageDialog(null, "Books Purchased: " + numBooks + "\nPoints Earned: 0");
                else if(numBooks == 1)
                    JOptionPane.showMessageDialog(null, "Books Purchased: " + numBooks + "\nPoints Earned: 5");
                else if(numBooks == 2)
                    JOptionPane.showMessageDialog(null, "Books Purchased: " + numBooks + "\nPoints Earned: 15");
                else if(numBooks == 3)
                    JOptionPane.showMessageDialog(null, "Books Purchased: " + numBooks + "\nPoints Earned: 30");
                else
                    JOptionPane.showMessageDialog(null, "Books Purchased: " + numBooks + "\nPoints Earned: 60");
            else
                JOptionPane.showMessageDialog(null, "Invalid input");


        }

    }

