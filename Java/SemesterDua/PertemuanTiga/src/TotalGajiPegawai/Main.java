package SemesterDua.PertemuanTiga.src.TotalGajiPegawai;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //SCANNER INSTANTIATION
        Scanner scanner = new Scanner(System.in);

        //DECLARE VARIABLE
        clsPegawai objpegawai = new clsPegawai();

        System.out.print("Masukkan NIK pegawai");
        objpegawai.NIK = scanner.next();
        scanner.close();
    }
}
