
package restaurants;

import java.util.Scanner;

public class restaurants {


    public static void main(String[] args) {

        String choice[]={"","",""};

        Scanner sc=new Scanner(System.in);
        System.out.println("Is anyone at your party vegetarian:");
        choice[0]=sc.nextLine();


        System.out.println("Is anyone at your party a vegan:");
        choice[1]=sc.nextLine();


        System.out.println("Is anyone at your party gluten free:");
        choice[2]=sc.nextLine();

        System.out.println("Here are your restaurent choices:");

        if(choice[0].equalsIgnoreCase("yes") && choice[1].equalsIgnoreCase("yes") && choice[2].equalsIgnoreCase("yes"))
        {
            System.out.println("Corner's cafe");
            System.out.println("Chef's kitchen");
        }
        else if(choice[0].equalsIgnoreCase("yes") && choice[1].equalsIgnoreCase("yes") && choice[2].equalsIgnoreCase("no"))
        {
            System.out.println("Corner's cafe");
            System.out.println("Chef's kitchen");
        }
        else if(choice[0].equalsIgnoreCase("yes") && choice[1].equalsIgnoreCase("no") && choice[2].equalsIgnoreCase("yes"))
        {
            System.out.println("Main Street pizza company");
            System.out.println("Corner's cafe");
            System.out.println("Chef's kitchen");
        }
        else if(choice[0].equalsIgnoreCase("no") && choice[1].equalsIgnoreCase("yes") && choice[2].equalsIgnoreCase("yes"))
        {

            System.out.println("Corner's cafe");
            System.out.println("Chef's kitchen");
        }
        else if(choice[0].equalsIgnoreCase("yes") && choice[1].equalsIgnoreCase("no") && choice[2].equalsIgnoreCase("no"))
        {
            System.out.println("Main Street pizza company");
            System.out.println("Corner's cafe");
            System.out.println("Mama's fine Italian");
            System.out.println("Chef's kitchen");
        }
        else if(choice[0].equalsIgnoreCase("no") && choice[1].equalsIgnoreCase("no") && choice[2].equalsIgnoreCase("yes"))
        {
            System.out.println("Main Street pizza company");
            System.out.println("Corner's cafe");
            System.out.println("Chef's kitchen");
        }
        else if(choice[0].equalsIgnoreCase("no") && choice[1].equalsIgnoreCase("yes") && choice[2].equalsIgnoreCase("no"))
        {

            System.out.println("Corner's cafe");
            System.out.println("Chef's kitchen");
        }
        else if(choice[0].equalsIgnoreCase("no") && choice[1].equalsIgnoreCase("no") && choice[2].equalsIgnoreCase("no"))
        {
            System.out.println("Joe's gourmet burgers");
            System.out.println("Main Street pizza company");
            System.out.println("Corner's cafe");
            System.out.println("Mama's fine Italian");
            System.out.println("Chef's kitchen");
        }
    }   }
