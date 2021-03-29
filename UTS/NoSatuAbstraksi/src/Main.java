package SemesterDua.UTS.NoSatuAbstraksi.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.awt.*;
import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        boolean containerB;    //userAnswer in Boolean Type
        int containerI;        //UserAnswer in Integer Type
        int banyakKaryawan = 1;
        String containerS;
        String jenisKelamin;
        String status;
        Karyawan objkaryawan = new Karyawan();

        //Declare Rupiah Format
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setGroupingSeparator('.');
        formatRp.setMonetaryDecimalSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        do
        {
            containerB = true;
            
            //Input Box Declaration
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JTextField input1 = new JTextField();
            JTextField input2 = new JTextField();
            JTextField input3 = new JTextField();
            JTextField input4 = new JTextField();
            JTextField input5 = new JTextField();
            JTextField input6 = new JTextField();

            panel.setLayout(new GridLayout(0, 2, 2, 2));

            panel.add(new JLabel("Masukkan NIK"));
            panel.add(input1);

            panel.add(new JLabel("Masukkan nama"));
            panel.add(input2);

            panel.add(new JLabel("Masukkan jenis kelamin ('L' Laki-Laki / 'P' Perempuan)"));
            panel.add(input3);

            panel.add(new JLabel("Masukkan status menikah ('M' Menikah / 'B' Belum)"));
            panel.add(input4);

            panel.add(new JLabel("Masukkan jumlah anak"));
            panel.add(input5);

            panel.add(new JLabel("Masukkan gaji"));
            panel.add(input6);

            //Showing input dialog box
            JOptionPane.showConfirmDialog(frame, panel, "SIlahkan isi data karyawan",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            //Casting all input from dialog box to object's field
            objkaryawan.NIK = input1.getText();
            objkaryawan.Nama = input2.getText();

            containerS = input3.getText();
            if(containerS.equals("L") || containerS.equals("l"))
            {
                jenisKelamin = "Laki-Laki";

            } else
            {
                jenisKelamin = "Perempuan";
            }

            containerS = input4.getText();
            if(containerS.equals("M") || containerS.equals("m"))
            {
                objkaryawan.Status = 'M';
                status = "Menikah";

            } else
            {
                objkaryawan.Status = 'B';
                status = "Belum";
            }
            
            try
            {
                objkaryawan.JumlahAnak = Integer.parseInt(input5.getText());
                
            } catch(NumberFormatException exception)
            {
                exception.printStackTrace();
            }
           
            try
            {
                objkaryawan.Gaji = Double.parseDouble(input6.getText());
                
            } catch(NumberFormatException exception)
            {
                exception.printStackTrace();
            }

            //Display karyawan's data in message box
            JOptionPane.showMessageDialog(frame, "======= Data Karyawan ke- " + banyakKaryawan + " =======\n" +
                    "NIK karyawan: " + objkaryawan.NIK + "\n" +
                    "Nama karyawan: " + objkaryawan.Nama + "\n" +
                    "Jenis kelamin karyawan: " + jenisKelamin + "\n" +
                    "Status pernikahan karyawan: " + status + "\n" +
                    "Jumlah anak karyawan: " + objkaryawan.JumlahAnak + "\n" +
                    "Gaji yang diterima karyawan: " + kursIndonesia.format(objkaryawan.Gaji) + "\n" +
                    "Tunjangan karyawan: " + kursIndonesia.format(objkaryawan.Tunjangan()) + "\n" +
                    "Pajak penghasilan karyawan: " + kursIndonesia.format(objkaryawan.PajakPenghasilan()) + "\n" +
                    "Total gaji karyawan: " + kursIndonesia.format(objkaryawan.TotalGaji()));

            //Ask user to try again
            containerI = JOptionPane.showConfirmDialog(frame, "Mau coba lagi [Y / T] : ",
                    "Question", JOptionPane.YES_NO_OPTION);

            if(containerI == 1)
            {
                containerB = false;
                JOptionPane.showMessageDialog(frame, "Terima kasih!");
            }   

            banyakKaryawan++;

        } while(containerB);
    }
}
