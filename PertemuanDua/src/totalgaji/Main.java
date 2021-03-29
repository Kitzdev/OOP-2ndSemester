package SemesterDua.PertemuanDua.src.totalgaji;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //SCANNER INITIALIZATION
        Scanner scanner = new Scanner(System.in);

        //VARIABLE DECLARATION
        clsDoctor objDoctor = new clsDoctor();

        //PROGRAM
        System.out.print("Masukkan ID dokter : ");
        objDoctor.idDokter = scanner.nextLine();

        System.out.print("Masukkan nama dokter : ");
        objDoctor.nama = scanner.nextLine();

        System.out.print("Masukkan gaji dokter : ");
        objDoctor.gaji = scanner.nextInt();

        System.out.println();
        System.out.println("ID dokter : " + objDoctor.idDokter);
        System.out.println("Nama dokter : " + objDoctor.nama);
        System.out.println("Gaji dokter : " + objDoctor.gaji);

        System.out.printf("Tunjangan dokter : %.2f", objDoctor.tunjangan(objDoctor.gaji));
        System.out.println();
        System.out.printf("Total gaji dokter : %.2f", objDoctor.totalGaji(objDoctor.gaji));
        scanner.close();
    }
}
