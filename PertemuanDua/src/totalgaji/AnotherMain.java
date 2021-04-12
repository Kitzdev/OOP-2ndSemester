package OOP2ndSemester.PertemuanDua.src.totalgaji;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import javax.swing.*;

public class AnotherMain
{
    public static void main(String[] args)
    {
        //SCANNER INITIALIZATION
        Scanner scanner = new Scanner(System.in);

        //VARIABLE DECLARATION
        int count;                      //Store number of doctor
        int searchValue;                //Store search value entered by user
        int userChoice;                 //Store user input
        String gajiContainer;           //Store clsDoctor class gaji value
        String searchContainer;         //Store doctor order entered by user
        String tunjanganContainer;      //Store number in string format
        String totalGajiContainer;      //Store number in string format

        //Declare rupiah format
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        //PROGRAM
        System.out.println("Selamat datang di program penghitung gaji!");
        System.out.print("Masukkan jumlah dokter: ");
        count = scanner.nextInt();
        scanner.nextLine();

        clsDoctor[] objdoctorData = new clsDoctor[count];    //Store all doctor data;

        //User input doctor data
        System.out.println();
        for(int i = 0; i < count; i++) {
            objdoctorData[i] = new clsDoctor();

            System.out.println("=========================================================");

            objdoctorData[i].idDokter = JOptionPane.showInputDialog("Masukkan ID dokter ke- " + (i + 1) + ":");
            System.out.println("ID dokter ke-" + (i + 1) + ": " + objdoctorData[i].idDokter);

            objdoctorData[i].nama = JOptionPane.showInputDialog("Masukkan nama dokter ke-" + (i + 1) + ":");
            System.out.println("Nama dokter ke-" + (i + 1) + ": " + objdoctorData[i].nama);

            gajiContainer = JOptionPane.showInputDialog("Masukkan gaji dokter ke-" + (i + 1) + ":");
            objdoctorData[i].gaji = Integer.parseInt(gajiContainer);
            gajiContainer = kursIndonesia.format(objdoctorData[i].gaji);
            System.out.println("Gaji dokter ke-" + (i + 1) + ": " + gajiContainer);

            JOptionPane.showMessageDialog(null,"Data dokter ke-" + (i + 1) +" berhasil disimpan!");

            tunjanganContainer = kursIndonesia.format(objdoctorData[i].tunjangan(objdoctorData[i].gaji));
            System.out.println();
            System.out.println("Tunjangan dokter ke-" + (i + 1) + " : " + tunjanganContainer);

            totalGajiContainer = kursIndonesia.format(objdoctorData[i].totalGaji(objdoctorData[i].gaji));
            System.out.println("Total gaji dokter ke-" + (i + 1) + " : " + totalGajiContainer);
            System.out.println();

            System.out.println("Data dokter ke-" + (i + 1) + " berhasil disimpan!");
            System.out.println("=========================================================");
            System.out.println();
        }

        System.out.println("=========================================================");
        System.out.println();

        //User search doctor data
        do
        {
            userChoice = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin mencari data dokter?",
                    "Pencarian Data", JOptionPane.YES_NO_OPTION);

            if (userChoice != 0)
            {
                break;
            }

            searchContainer = JOptionPane.showInputDialog(null,
                    "Ingin mencari data dokter urutan keberapa?");
            searchValue = Integer.parseInt(searchContainer);
            searchValue--;

            if(!(searchValue <= count - 1 && searchValue >= 0))
            {
                JOptionPane.showMessageDialog(null, "Urutan dokter yang dimasukkan tidak ditemukan");
                continue;
            }

            //Message Dialog showing doctor data
            tunjanganContainer = kursIndonesia.format
                    (objdoctorData[searchValue].tunjangan(objdoctorData[searchValue].gaji));
            totalGajiContainer = kursIndonesia.format
                    (objdoctorData[searchValue].totalGaji(objdoctorData[searchValue].gaji));

            JOptionPane.showMessageDialog(null, "ID dokter ke-" + (searchValue + 1) + " : " +
                    objdoctorData[searchValue].idDokter + "\n" + "Nama dokter ke-" + (searchValue + 1) + " : " +
                    objdoctorData[searchValue].nama + "\n" + "Gaji dokter ke-" + (searchValue + 1) + " : " +
                    objdoctorData[searchValue].gaji + "\n" + "Tunjangan dokter ke-" + (searchValue + 1)  + " : " +
                    tunjanganContainer + "\n" + "Total gaji dokter ke-" + (searchValue + 1) + " : " +
                    totalGajiContainer);

            //Print to console about doctor data
            System.out.println("=========================================================");
            System.out.println("Berikut data dokter yang dicari: ");
            System.out.println();
            System.out.println("ID dokter ke-" + (searchValue + 1) + " : " + objdoctorData[searchValue].idDokter);
            System.out.println("Nama dokter ke-" + (searchValue + 1) + " : " + objdoctorData[searchValue].nama);

            gajiContainer = kursIndonesia.format(objdoctorData[searchValue].gaji);
            System.out.println("Gaji dokter ke-" + (searchValue + 1) + " : " + gajiContainer);
            System.out.println();

            System.out.println("Tunjangan dokter ke-" + (searchValue + 1) + " : " + tunjanganContainer);
            System.out.println("Total gaji dokter ke-" + (searchValue + 1) + " : " + totalGajiContainer);

            System.out.println("=========================================================");
            System.out.println();

        }while(userChoice == 0);

        scanner.close();
        System.out.println("Program berakhir!");
    }
}
