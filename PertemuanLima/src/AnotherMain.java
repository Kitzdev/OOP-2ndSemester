package SemesterDua.PertemuanLima.src;

import java.util.Scanner;

public class AnotherMain
{
    public static void main(String[] args) 
    {
        //SCANNER DECLARATION
        Scanner scanner = new Scanner(System.in);

        int amountOfData;
        int userAnswerInt;
        DoubleArray array = new DoubleArray();

        System.out.print("Ingin membuat double array berukuran berapa? : ");
        amountOfData = scanner.nextInt();
        scanner.nextLine();

        array.AddAmount(amountOfData);

        do {
            System.out.println();
            System.out.print("Silahkan pilih fitur: \nKetik 1 untuk proses input\nKetik 2 untuk proses " +
                    "penjumlahan\nKetik 3 untuk proses pencetakann\nKetik selain angka tersebut" +
                    " untuk keluar\nJawab: ");
            userAnswerInt = scanner.nextInt();

            if (userAnswerInt == 1)
            {
                array.InputArray();

            } else if (userAnswerInt == 2)
            {
                array.AddArray();

            } else if (userAnswerInt == 3)
            {
                System.out.println();
                System.out.print("Silahkan pilih fitur: \nKetik 1 untuk cetak array pertama\nKetik 2 untuk " +
                        "cetak array kedua\nKetik 3 untuk cetak array hasil penjumlahan\nKetik selain angka tersebut" +
                        " untuk keluar\nJawab: ");
                userAnswerInt = scanner.nextInt();

                if (userAnswerInt == 1)
                {
                    array.PrintArray(1);

                } else if (userAnswerInt == 2)
                {
                    array.PrintArray(2);

                } else if (userAnswerInt == 3)
                {
                    array.PrintArray(3);

                } else
                {
                    break;
                }
            } else
            {
                break;
            }

        } while (true);
        scanner.close();
    }
}
