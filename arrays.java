import java.util.Arrays;

public class arrays {
        public static void main(String[] args) {

            // Declare and initialize arrays
            String[] names = {"Trey", "Jamie-Trey's Mom", "Jim-Trey's Dad"};
            int[] ages = {20, 42, 52};
            String[] cities = {"Wabash", "Wabash", "Logansport"};

            
            System.out.println("Names:");
            for (String name : names) {
                System.out.println(name);
            }

            System.out.println("\nAges:");
            for (int age : ages) {
                System.out.println(age);
            }

            System.out.println("\nCities:");
            for (String city : cities) {
                System.out.println(city);
            }
        }
    }


