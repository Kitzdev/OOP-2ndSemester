package OOP2ndSemester.UTS.NoDuaPropertyMethod.src;

public class Rental 
{
    private String NoPlat;
    private String JenisKendaraan;  //M = minibus, B = Bus, T = Truk
    private double BiayaSewa;
    private int LamaSewa;

    public void setNoPlat(String NoPlat)
    {
        this.NoPlat = NoPlat;
    }

    public String getNoPlat()
    {
        return this.NoPlat;
    }

    public void setJenisKendaraan(String JenisKendaraan)
    {
        this.JenisKendaraan = JenisKendaraan;
    }

    public String getJenisKendaraan()
    {
        return this.JenisKendaraan;
    }

    public void setBiayaSewa(double BiayaSewa)
    {
        this.BiayaSewa = BiayaSewa;
    }

    public double getBiayaSewa()
    {
        return this.BiayaSewa;
    }

    public void setLamaSewa(int LamaSewa)
    {
        this.LamaSewa = LamaSewa;
    }

    public int getLamaSewa()
    {
        return this.LamaSewa;
    }

    //Class Method Part
    public double SubTotal()
    {
        return BiayaSewa * (double)LamaSewa;
    }

    public double JumlahDiskon()
    {
        if(LamaSewa >= 5)
        {
            return 0.1 * SubTotal();

        } else
        {
            return 0;
        }
    }

    public double TotalBiaya()
    {
        return SubTotal() - JumlahDiskon();
    }
}
