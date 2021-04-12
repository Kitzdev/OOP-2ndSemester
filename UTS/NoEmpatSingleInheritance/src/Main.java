package OOP2ndSemester.UTS.NoEmpatSingleInheritance.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        //Variable Declaration
        boolean isLoop;
        char userAnswerC;
        double userAnswerD;
        String userAnswerS;
        String jenisKelamin;
        String status;
        Scanner scanner = new Scanner(System.in);
        Guru objGuru = new Guru();

        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setGroupingSeparator('.');
        formatRp.setDecimalSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        //Program
        System.out.println("==========================================");
        System.out.println("Selamat Datang di Program Penghitung gaji!");
        System.out.println("==========================================\n");

        do
        {
            isLoop = false;
            System.out.print("Masukkan NIK guru: ");
            userAnswerS = scanner.nextLine();
            objGuru.setNIK(userAnswerS);

            System.out.print("Masukkan nama guru: ");
            userAnswerS = scanner.nextLine();
            objGuru.setNama(userAnswerS);

            System.out.print("Masukkan jenis kelamin guru ('L' = Laki-Laki / 'P' = Perempuan): ");
            userAnswerC = scanner.next().charAt(0);
            objGuru.setJenisKelamin(userAnswerC);

            if(userAnswerC == 'L' || userAnswerC == 'l')
            {
                if(userAnswerC == 'l')
                {
                    userAnswerC = 'L';
                    objGuru.setJenisKelamin(userAnswerC);
                }

                jenisKelamin = "Laki-Laki";

            } else
            {
                if(userAnswerC == 'p')
                {
                    userAnswerC = 'P';
                    objGuru.setJenisKelamin(userAnswerC);
                }
                
                jenisKelamin = "Perempuan";
            }

            System.out.print("Masukkan status guru ('T' = Tetap / 'H' = Honorer): ");
            userAnswerC = scanner.next().charAt(0);
            objGuru.setStatus(userAnswerC);

            if(userAnswerC == 'T' || userAnswerC == 't')
            {
                if(userAnswerC == 't')
                {
                    userAnswerC = 'T';
                    objGuru.setStatus(userAnswerC);
                }

                status = "Tetap";

            } else
            {
                if(userAnswerC == 'h')
                {
                    userAnswerC = 'H';
                    objGuru.setStatus(userAnswerC);
                }

                status = "Honorer";
            }

            System.out.print("Masukkan gaji guru: ");
            userAnswerD = scanner.nextDouble();
            objGuru.setGaji(userAnswerD);
            
            System.out.println("\n==========================================");
            System.out.println("  Berikut ditampilkan hasil perhitungan: \n");

            userAnswerS = objGuru.getNIK();
            System.out.println("NIK guru                     : " + userAnswerS);

            userAnswerS = objGuru.getNama();
            System.out.println("Nama guru                    : " + userAnswerS);

            System.out.println("Jenis kelamin guru           : " + jenisKelamin);
            System.out.println("Status guru                  : " + status);
            System.out.println("Gaji yang diterima guru      : " + kursIndonesia.format(objGuru.getGaji()));
            System.out.println("Tunjangan yang diterima guru : " + kursIndonesia.format(objGuru.Tunjangan()));
            System.out.println("Pajak penghasilan guru       : " + kursIndonesia.format
            (objGuru.PajakPenghasilan()));
            System.out.println("Total gaji yang diterima guru: " + kursIndonesia.format(objGuru.TotalGaji()));

            System.out.print("\nMau coba lagi [Y / T]: ");
            userAnswerC = scanner.next().charAt(0);

            if(userAnswerC == 'Y' || userAnswerC == 'y')
            {
                isLoop = true;
            }

            //Clean buffer
            scanner.nextLine();
            
        } while(isLoop);

        System.out.println("Terima kasih!");

        scanner.close();
    }
}
