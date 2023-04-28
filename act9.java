import java.util.Arrays;
import java.util.Scanner;

public class act9 {
    static boolean changeValue = true;
    public static void main(String[] args) {

        int value = 0,
                correctGuess = 0,
                incorrectGuess = 0,
                total = 0;
        final String[] colors = new String[] {"red", "green", "blue", "orange", "yellow"};
        String color = "";


        System.out.println("You must randomly select any of these colors: " + Arrays.toString(colors));
        System.out.println("If the guessed color is correct, or incorrect, the program will tell you.\n" +
                "Good luck\n");

        Scanner input = new Scanner(System.in);


        while (total < 10) {


            if (changeValue == true) {
                value = ((int) (Math.random() * 100) % 5 + 0);
            }
            System.out.println("Please select a color, and type it ("+Arrays.toString(colors)+"): ");
            String selectedColor = input.nextLine();

            color = colors[value];


            if (selectedColor.equalsIgnoreCase(color)) {
                correctGuess = correctGuess + 1;
                System.out.println("\nGood guess! Color was: " + color + "\n");
                changeValue = true;
            } else if (Arrays.asList(colors).contains(selectedColor) && selectedColor != color){
                System.out.println("\nBad guess. Color was: " + color + "\n");
                incorrectGuess = incorrectGuess + 1;
                changeValue = true;
            }
            else {
                System.out.println("\nIncorrect entry, try again\n");
                changeValue = false;
            }



            total = correctGuess + incorrectGuess;
        }
        System.out.println("You have gotten " + correctGuess + "/10 guesses correct");
    }
}