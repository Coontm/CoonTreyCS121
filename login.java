import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        //Create the tool for reading, assign it to variable caller "scanner
        Scanner scanner = new Scanner(System.in);

        //Print user a message " "
        System.out.println("Pick a all time great pokemon from the following, Bulbasaur, Charmander, Squirtle, Eevee: ");


        String message = scanner.nextLine();

        System.out.println("Eevee is a normal type");
        System.out.println("Bulbasaur is a grass type");
        System.out.println("Charmander is a fire type");
        System.out.println("Squirtle is a water type");


    }}
