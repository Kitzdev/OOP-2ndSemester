package OOP2ndSemester.PertemuanDelapan.src;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        String userAnswerS;
        double userAnswerD;
        int userAnswerI;
        
        System.out.println("Pet Name: ");
        cat.name = scanner.nextLine();
        
        System.out.println("Cat weight: ");
        cat.weight = scanner.nextDouble();

        System.out.println("Cat height: ");
        cat.height = scanner.nextDouble();
        
        System.out.println("Choose (1 - 3): \n1. Walk\n2. Eat\n3. Show height\nAnswer: ");
        userAnswerI = scanner.nextInt();

        if(userAnswerI == 1)
        {
            System.out.println("Insert place: ");
            userAnswerS = scanner.nextLine();

            cat.walk(userAnswerS);

        } else if(userAnswerI == 2)
        {
            System.out.println("How many " + cat.name +" want to eat? (in kg): ");
            userAnswerD = scanner.nextDouble();

            cat.eat(userAnswerD);

        } else
        {
            cat.height();
        }


        scanner.close();
    }
}