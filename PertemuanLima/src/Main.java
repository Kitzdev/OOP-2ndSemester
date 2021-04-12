package OOP2ndSemester.PertemuanLima.src;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //SCANNER DECLARATION
        Scanner scanner = new Scanner(System.in);

        //PROGRAM "FLEXIBLE MATRIX SIZE MULTIPLIER"

        int baris1, baris2, kolom1, kolom2;
        int container; //Menyimpan hasil penjumlahan dari perkalian antara baris dan kolom matriks

        System.out.print("Masukkan ukuran baris matriks pertama: ");
        baris1 = scanner.nextInt();

        System.out.print("Masukkan ukuran kolom matriks pertama: ");
        kolom1 = scanner.nextInt();

        System.out.print("Masukkan ukuran baris matriks kedua: ");
        baris2 = scanner.nextInt();

        System.out.print("Masukkan ukuran kolom matriks kedua: ");
        kolom2 = scanner.nextInt();


        //Deklarasi matriks
        int matriks1[][] = new int[baris1][kolom1];
        int matriks2[][] = new int[baris2][kolom2];
        int matriksHasil[][] = new int[baris1][kolom2];

        if(kolom1 == baris2)
        {
            System.out.println();
            System.out.println("Masukkan nilai matriks pertama: ");

            for(int i = 0; i < baris1; i++)
            {
                for(int j = 0; j < kolom1; j++)
                {
                    System.out.print("Baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " : ");
                    matriks1[i][j] = scanner.nextInt();
                }
            }

            System.out.println();
            System.out.println("Masukkan nilai matriks kedua: ");

            for(int i = 0; i < baris2; i++)
            {
                for(int j = 0; j < kolom2; j++)
                {
                    System.out.print("Baris ke-" + (i + 1) + " kolom ke-" + (j + 1) +  " : ");
                    matriks2[i][j] = scanner.nextInt();
                }
            }

            //Proses perkalian 2 buah matriks
            for(int i = 0; i < baris1; i++)
            {
                for(int j = 0; j < kolom2; j++)
                {
                    container = 0;

                    for(int k = 0; k < kolom1; k++)
                    {
                        container += matriks1[i][k] * matriks2[k][j];
                    }

                    matriksHasil[i][j] = container;
                }
            }

            System.out.println();
            System.out.println("Perkalian matriks dengan ordo " + baris1 + "x" + kolom1 + " dengan " +
                            baris2 + "x" + kolom2);

            System.out.println("Matriks ke-1: ");
            for(int i = 0; i < baris1; i++)
            {
                for(int j = 0; j < kolom1; j++)
                {
                    System.out.print(matriks1[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println();

            System.out.println("Matriks ke-2: ");
            for(int i = 0; i < baris2; i++)
            {
                for(int j = 0; j < kolom2; j++)
                {
                    System.out.print(matriks2[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println();
            System.out.println("Menghasilkan matriks dengan ordo " + baris1 + "x" + kolom2);

            //Proses pencetakan hasil perkalian matriks
            for(int i = 0; i < baris1; i++)
            {
                for(int j = 0; j < kolom2; j++)
                {
                    System.out.print(matriksHasil[i][j] + " ");
                }

                System.out.println();
            }

        } else
        {
            System.out.println("Tidak bisa melakukan perkalian karena kolom matriks pertama " +
                    "dan baris matriks kedua berbeda");
        }
        scanner.close();
    }
}
