package SemesterDua.tes;

import javax.swing.JOptionPane;

public class sewaalat {
    
    public static void main(String[] args) {
        sewaalatberat objsewaalat = new sewaalatberat();
        
        String coba;
        for (int i = 0; i < 100; i++) {
            coba = JOptionPane.showInputDialog("Masukan Kode Alat berat");
            objsewaalat.setkodealatberat(coba);
            coba = JOptionPane.showInputDialog("Masukan nama Alat berat");
            objsewaalat.setnamaalatberat(coba);
 String t_biayasewaperjam = JOptionPane.showInputDialog("Biaya sewa per jam ");
                coba = JOptionPane.showInputDialog("Masukan Lama sewa per jam");
                objsewaalat.setlamasewaperjam(coba);
            coba = JOptionPane.showInputDialog("Masukan nama penyewa");
            objsewaalat.setnamapenyewa(coba);
            coba = JOptionPane.showInputDialog("Masukan no ktp penyewa");
            objsewaalat.setnoktppenyewa(coba);

               JOptionPane.showMessageDialog(null,
            "========== Output ==========" + "\n" +
"kode alat berat:"+objsewaalat.getKodealatberat()+ 
"Nama alat berat:"+objsewaalat.getnamaalatberat()+
"Biaya sewa per jam:"+objsewaalat.getbiayasewaperjam()+
"lama sewa per jam:"+objsewaalat.getlamasewaperjam ()+
"Nama penyewa:" +objsewaalat.getNamapenyewa()+

"no ktp penyewa:"+objsewaalat.getnoktppenyewa()+
"sub total:Rp."+ objsewaalat.getSubTotalSewa ()+
"potongan harga :Rp"+objsewaalat.getpotonganharga ()+
"total biaya :Rp"+objsewaalat.getotalbiaya ()+
"============================");
        Coba = JOptionPane.showInputDialog("Mau Coba Lagi? (Y / T)");
        if (Coba == "Y") {
            continue;
        }
                else if (Coba == "T") {
            break;
                }
        }
    }
}