package OOP2ndSemester.UTS.NoSatuAbstraksi.src;

public class Karyawan
{
    public String NIK;
    public String Nama;
    public boolean JenisKelamin;    //1 = Laki-Laki, 0 = Perempuan
    public char Status;             //M = Menikah, B = Belum
    public int JumlahAnak;
    public double Gaji;

    public double Tunjangan()
    {
        if((Status == 'M' || Status == 'm'))
        {
            if(JumlahAnak <= 3)
            {
                return JumlahAnak * (0.03 * Gaji);
                
            } else
            {
                return 3 * (0.03 * Gaji);
            }

        }  else
        {
            return 0;
        }
    }

    public double PajakPenghasilan()
    {
        return 0.025 * Gaji;
    }

    public double TotalGaji()
    {
        return Gaji + Tunjangan() + PajakPenghasilan();
    }

}
