package OOP2ndSemester.PertemuanLima.src;

import java.util.Scanner;

public class DoubleArray
{
    String userAnswer;
    int amountOfData;
    Scanner scanner = new Scanner(System.in);

    void AddAmount(int amountOfData)
    {
        this.amountOfData = amountOfData;
    }

    int array1[] = new int[100];
    int array2[] = new int[100];
    int array3[] = new int[100];
    boolean isInputed = false;
    boolean isArrayThreeReady = false;

    void InputArray()
    {
        if(!isInputed)
        {
            System.out.println();
            System.out.println("Masukkan data array pertama: ");
            for (int i = 0; i < amountOfData; i++)
            {
                System.out.print("Data ke-" + (i + 1) + " : ");
                array1[i] = scanner.nextInt();
            }

            System.out.println();

            System.out.println("Masukkan data array kedua: ");
            for (int i = 0; i < amountOfData; i++) {
                System.out.print("Data ke-" + (i + 1) + " : ");
                array2[i] = scanner.nextInt();
                scanner.nextLine();
            }

        } else
        {
            System.out.print("Apakah ingin melakukan input ulang array? (jawab dengan y atau t): ");
            userAnswer = scanner.nextLine();

            if(userAnswer == "y" || userAnswer == "Y")
            {
                isInputed = false;
                InputArray();
            }
        }

        isInputed = true;
    }

    void AddArray()
    {
        if(isInputed) {
            for (int i = 0; i < amountOfData; i++)
            {
                array3[i] = 0;
                array3[i] += array1[i] + array2[i];
                isArrayThreeReady = true;
            }
        } else
        {
            System.out.println("Mohon masukkan nilai terlebih dahulu kedalam array!");
        }
    }

    void Print(int array[])
    {
        for(int i = 0; i < amountOfData; i++)
        {
            System.out.println(array[i] + " ");
        }
    }

    void PrintArray(int typeOfPrint)
    {

        if(typeOfPrint == 1)
        {
            Print(array1);

        } else if(typeOfPrint == 2)
        {
            Print(array2);

        } else
        {
            if (isArrayThreeReady)
            {
                Print(array3);

            } else
            {
                System.out.println("Lakukan penjumlahan array terlebih dahulu!");
            }
        }
    }
}
