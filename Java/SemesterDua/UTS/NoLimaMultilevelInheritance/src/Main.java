package SemesterDua.UTS.NoLimaMultilevelInheritance.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        boolean isLoop;
        char userAnswerC;
        String jenisKelamin;
        String status;
        SpesialisJantung objdokter = new SpesialisJantung();
        Scanner scanner = new Scanner(System.in);

        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setGroupingSeparator('.');
        formatRp.setDecimalSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println("============================================");
        System.out.println(" Selamat datang di program penghitung gaji!");
        System.out.println("============================================");

        do
        {
            isLoop = false;
            System.out.print("\nMasukkan NID dokter   : ");
            objdokter.NID = scanner.nextLine();

            System.out.print("Masukkan nama dokter  : ");
            objdokter.Nama = scanner.nextLine();

            System.out.print("Masukkan jenis kelamin dokter ('L' Laki-Laki / 'P' Perempuan): ");
            objdokter.JenisKelamin = scanner.next().charAt(0);

            if(objdokter.JenisKelamin == 'L' || objdokter.JenisKelamin == 'l')
            {
                jenisKelamin = "Laki-Laki";

            } else
            {
                jenisKelamin = "Perempuan";
            }

            System.out.print("Masukkan status dokter!\n1. 'U' untuk umum\n2. 'S' untuk spesialis\nJawab: ");
            userAnswerC = scanner.next().charAt(0);

            if(userAnswerC == 'S' || userAnswerC == 's')
            {
                status = "Spesialis";
                System.out.print("Masukkan total jam praktek dokter: ");
                objdokter.TotalJamPraktek = scanner.nextDouble();

                System.out.print("Apakah dokter merupakan spesialis jantung? [ Y / T ]: ");
                userAnswerC = scanner.next().charAt(0);

                if(userAnswerC == 'Y' || userAnswerC == 'y')
                {
                    objdokter.Status = 'S';
                    status = "Spesialis Jantung";

                } else
                {
                    objdokter.Status = 'S';
                    status = "Spesialis";
                }

            } else
            {
                status = "Umum";
            }

            System.out.print("Masukkan Gaji dokter: ");
            objdokter.Gaji = scanner.nextDouble();

            System.out.println("\n============================================");
            System.out.println("   Berikut ditampilkan hasil perhitungan: ");

            System.out.println("NID dokter          : " + objdokter.NID);
            System.out.println("Nama dokter         : " + objdokter.Nama);
            System.out.println("Jenis kelamin dokter: " + jenisKelamin);
            System.out.println("Status dokter       : " + status);
            System.out.println("Gaji dokter         : " + kursIndonesia.format(objdokter.Gaji));

            if(objdokter.Status != 'U')
            {
                System.out.println("Total jam praktek   : " + objdokter.TotalJamPraktek + " jam");
                System.out.println("Tunjangan Spesialis : " + kursIndonesia.format(objdokter.TunjanganSpesialis()));

                if(status.equals("Spesialis Jantung"))
                {
                    System.out.println("Uang praktek dokter : " + kursIndonesia.format(objdokter.UangPraktek()));
                    System.out.println("Pajak penghasilan   : " + kursIndonesia.format(objdokter.PajakPenghasilan()));
                    System.out.println("Total gaji          : " + kursIndonesia.format(objdokter.TotalGaji()));
                }
            }
            
            System.out.println("============================================");
            System.out.print("Mau coba lagi [ Y / T ] : ");
            userAnswerC = scanner.next().charAt(0);

            if(userAnswerC == 'Y' || userAnswerC == 'y')
            {
                isLoop = true;
            }

            //Clean Buffer
            scanner.nextLine();
        } while(isLoop);
        
        System.out.println("Terima kasih!");
        scanner.close();
    }    
}
