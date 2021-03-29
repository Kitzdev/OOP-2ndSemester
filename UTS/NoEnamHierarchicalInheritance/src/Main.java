package SemesterDua.UTS.NoEnamHierarchicalInheritance.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Main 
{
    public static void main(String[] args)
    {
        boolean isLoop;
        int containerI;
        GuruTetap objguruTetap = new GuruTetap();
        GuruHonorer objguruHonorer = new GuruHonorer();

        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setGroupingSeparator('.');
        formatRp.setDecimalSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        do
        {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JTextField input1 = new JTextField();
            JTextField input2 = new JTextField();
            JTextField input3 = new JTextField();
            JTextField input4 = new JTextField();
            JTextField input5 = new JTextField();

            panel.setLayout(new GridLayout(0, 2, 2, 2));

            panel.add(new JLabel("Masukkan NIK guru"));
            panel.add(input1);

            panel.add(new JLabel("Masukkan nama guru"));
            panel.add(input2);

            panel.add(new JLabel("Masukkan jenis kelamin ('L' Laki-Laki / 'P' Perempuan)"));
            panel.add(input3);

            panel.add(new JLabel("Masukkan status guru ('T' Tetap / 'H' Honorer)"));
            panel.add(input4);

            panel.add(new JLabel("Masukkan gaji"));
            panel.add(input5);

            //Showing input dialog box
            JOptionPane.showConfirmDialog(frame, panel, "Silahkan isi data pendidik", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            //Initialize object atribute
            if(input4.getText() == "T" || input4.getText() == "t")
            {
                objguruTetap.setNIK(input1.getText());
                objguruTetap.setNama(input2.getText());

                if(input3.getText().equals("L") || input3.getText().equals("l"))
                {
                    objguruTetap.setJenisKelamin("Laki-Laki");

                } else
                {
                    objguruTetap.setJenisKelamin("Perempuan");
                }

                if(input4.getText().equals("T") || input4.getText().equals("t"))
                {
                    objguruTetap.setStatus("Tetap");

                } else
                {
                    objguruTetap.setJenisKelamin("Honorer");
                }

                try
                { 
                    objguruTetap.setGaji(Double.parseDouble(input5.getText()));

                } catch(NumberFormatException exception)
                {
                    exception.printStackTrace();
                }

            } else
            {
                objguruHonorer.setNIK(input1.getText());
                objguruHonorer.setNama(input2.getText());

                if(input3.getText().equals("L") || input3.getText().equals("l"))
                {
                    objguruHonorer.setJenisKelamin("Laki-Laki");

                } else
                {
                    objguruHonorer.setJenisKelamin("Perempuan");
                }

                if(input4.getText().equals("T") || input4.getText().equals("t"))
                {
                    objguruHonorer.setStatus("Tetap");

                } else
                {
                    objguruHonorer.setStatus("Honorer");
                }

                try
                { 
                    objguruHonorer.setGaji(Double.parseDouble(input5.getText()));

                } catch(NumberFormatException exception)
                {
                    exception.printStackTrace();
                }
            }

            if(input4.getText() == "T" || input4.getText() == "t")
            {
                JOptionPane.showMessageDialog(frame, "========== Data Guru ==========\nNIK guru: " + objguruTetap.getNIK() + "\nNama guru: " + objguruTetap.getNama() + "\nJenis kelamin guru: " + objguruTetap.getJenisKelamin() + "\nStatus guru: " + objguruTetap.getStatus() + "\nGaji guru" + kursIndonesia.format(objguruTetap.getGaji()) + "\nTunjangan guru: " + kursIndonesia.format(objguruTetap.Tunjangan()) + "\nPajak penghasilan: " + kursIndonesia.format(objguruTetap.PajakPenghasilan()) + "\nTotal gaji: " + kursIndonesia.format(objguruTetap.TotalGaji()));

            } else
            {
                JOptionPane.showMessageDialog(frame, "========== Data Guru ==========\nNIK guru: " + objguruHonorer.getNIK() + "\nNama guru: " + objguruHonorer.getNama() + "\nJenis kelamin guru: " + objguruHonorer.getJenisKelamin() + "\nStatus guru: " + objguruHonorer.getStatus() + "\nGaji guru: " + kursIndonesia.format(objguruHonorer.getGaji()) + "\nTunjangan guru: " + kursIndonesia.format(objguruHonorer.Tunjangan()) + "\nTotal gaji: " + kursIndonesia.format(objguruHonorer.TotalGaji()));
            }


            containerI = JOptionPane.showConfirmDialog(frame, "Mau coba lagi [ Y / T ]", "Silahkan jawab", JOptionPane.YES_NO_OPTION);

            if(containerI == 0)
            {
                isLoop = true;

            } else
            {
                isLoop = false;
                JOptionPane.showMessageDialog(frame, "Terima kasih!");
            }

        } while(isLoop);
    }
}
