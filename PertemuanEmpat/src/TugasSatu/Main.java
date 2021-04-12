package OOP2ndSemester.PertemuanEmpat.src.TugasSatu;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        //Scanner Declaration
        Scanner scanner = new Scanner(System.in);

        //Object and variable Declaration
        clsPenyewa objPenyewa = new clsPenyewa();

        //Declare rupiah format
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setGroupingSeparator('.');
        formatRp.setMonetaryDecimalSeparator(',');

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        //Program

        //Data input process
        System.out.print("Masukkan ID penyewa: ");
        objPenyewa.idPenyewa = scanner.nextLine();

        System.out.print("Masukkan Nama penyewa: ");
        objPenyewa.nama = scanner.nextLine();

        System.out.print("Masukkan Alamat penyewa: ");
        objPenyewa.alamat = scanner.nextLine();

        System.out.print("Masukkan nomor KTP penyewa: ");
        objPenyewa.noKTP = scanner.nextLine();

        System.out.print("Masukkan nomor telepon penyewa: ");
        objPenyewa.noTelepon = scanner.nextLine();

        System.out.print("Masukkan jenis kendaraan yang disewa: ");
        objPenyewa.jenisKendaraan = scanner.nextLine();

        System.out.print("Masukkan nomor plat kendaraan yang disewa: ");
        objPenyewa.noPlat = scanner.nextLine();

        System.out.print("Masukkan durasi sewa kendaraan (satuan hari): ");
        objPenyewa.lamaSewa = scanner.nextInt();

        System.out.print("Masukkan biaya sewa kendaraan (angka dalam satuan rupiah): ");
        objPenyewa.biayaSewa = scanner.nextInt();

        //Data output process
        System.out.println();
        System.out.println("=================================================================");
        System.out.println("Berikut ditampilkan data penyewa: ");
        System.out.println("ID penyewa : " + objPenyewa.idPenyewa);
        System.out.println("Nama penyewa : " + objPenyewa.nama);
        System.out.println("Alamat penyewa : " + objPenyewa.alamat);
        System.out.println("Nomor KTP penyewa : " + objPenyewa.noKTP);
        System.out.println("Nomor telepon penyewa : " + objPenyewa.noTelepon);
        System.out.println("Jenis kendaraan penyewa : " + objPenyewa.jenisKendaraan);
        System.out.println("Nomor plat kendaraan penyewa : " + objPenyewa.noPlat);
        System.out.println("Durasi sewa kendaraan: " + objPenyewa.lamaSewa + " hari");
        System.out.println("Biaya sewa kendaraan: " + kursIndonesia.format(objPenyewa.biayaSewa));
        System.out.println();
        System.out.println("Dengan rincian pembayaran: ");
        System.out.println("Total biaya sewa: " + kursIndonesia.format
                (objPenyewa.TotalSewa(objPenyewa.lamaSewa, objPenyewa.biayaSewa)));
        System.out.println("Potongan harga sewa: " + kursIndonesia.format
                (objPenyewa.PotonganHarga(objPenyewa.lamaSewa, objPenyewa.biayaSewa)));
        System.out.println("PPN:" + kursIndonesia.format
                (objPenyewa.PPN(objPenyewa.lamaSewa, objPenyewa.biayaSewa)));
        System.out.println("Total bayar: " + kursIndonesia.format
                (objPenyewa.HarusBayar(objPenyewa.lamaSewa, objPenyewa.biayaSewa)));

        scanner.close();
    }
}
