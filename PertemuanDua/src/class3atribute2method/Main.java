package OOP2ndSemester.PertemuanDua.src.class3atribute2method;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //INITIALIZE SCANNER
        Scanner scanner = new Scanner(System.in);

        //VARIABLE DECLARATION
        clsPet animal = new clsPet();

        //PROGRAM
        System.out.print("Pet's name: ");
        animal.name = scanner.nextLine();

        System.out.print("Pet's weight: ");
        animal.weight = scanner.nextFloat();

        System.out.print("Pet's height: ");
        animal.height = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Pet's favourite food: ");
        animal.food = scanner.nextLine();

        System.out.print("Pet's favourite place: ");
        animal.place = scanner.nextLine();

        animal.petBMI();
        animal.eat();
        animal.walk();

        scanner.close();
    }
}
