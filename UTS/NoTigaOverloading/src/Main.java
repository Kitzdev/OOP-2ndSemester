package OOP2ndSemester.UTS.NoTigaOverloading.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        boolean isLoop;
        char userAnswerC;
        Scanner scanner = new Scanner(System.in);

        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setGroupingSeparator('.');
        formatRp.setMonetaryDecimalSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println("==========================================");
        System.out.println("  Selamat datang di program penghitung!");
        System.out.println("==========================================\n");
    
        do
        {
            isLoop = false;
            Penjualan objpenjualan = new Penjualan();
            System.out.print("Masukkan kode barang: ");
            objpenjualan.Kode = scanner.nextLine();

            System.out.print("Masukkan nama barang: ");
            objpenjualan.NamaBarang = scanner.nextLine();

            System.out.print("Masukkan harga barang: ");
            objpenjualan.HargaBarang = scanner.nextDouble();

            System.out.print("Masukkan jumlah barang: ");
            objpenjualan.Quantity = scanner.nextInt();

            System.out.print("Ingin memberikan diskon? [Y / T]: ");
            userAnswerC = scanner.next().charAt(0);

            if(userAnswerC == 'y' || userAnswerC == 'Y')
            {
                objpenjualan.Diskon = objpenjualan.Hitung(objpenjualan.HargaBarang);
            }

            System.out.println("\n==========================================");
            System.out.println("  Berikut ditampilkan hasil perhitungan: \n");

            System.out.println("Kode barang  : " + objpenjualan.Kode);
            System.out.println("Nama barang  : " + objpenjualan.NamaBarang);
            System.out.println("Harga barang : " + kursIndonesia.format(objpenjualan.HargaBarang));
            System.out.println("Jumlah barang: " + objpenjualan.Quantity);
            System.out.println("Sub total    : " + kursIndonesia.format(objpenjualan.Hitung()));
            System.out.println("Diskon       : " + kursIndonesia.format(objpenjualan.Diskon));
            System.out.println("Total harga  : " + kursIndonesia.format
            (objpenjualan.Hitung(objpenjualan.HargaBarang, objpenjualan.Quantity)));

            System.out.println("==========================================");
            System.out.print("\nMau coba lagi [Y / T] : ");
            userAnswerC = scanner.next().charAt(0);

            if(userAnswerC == 'y' || userAnswerC == 'Y')
            {
                isLoop = true;
            }

            scanner.nextLine();
            objpenjualan.Diskon = 0.0;

        } while(isLoop);

        System.out.println("Terima kasih!");

        scanner.close();
    }
}
