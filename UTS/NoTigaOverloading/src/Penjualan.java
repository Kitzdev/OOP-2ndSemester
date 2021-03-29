package SemesterDua.UTS.NoTigaOverloading.src;

public class Penjualan 
{
    public String Kode;
    public String NamaBarang;
    public double HargaBarang;
    public int Quantity;
    public double Diskon = 0.0;

    //Class Method

    //Sub total 
    public double Hitung()
    {
        return HargaBarang * Quantity;
    }

    //Diskon
    public double Hitung(double HargaBarang)
    {
        return (((HargaBarang * Quantity) / 100) * 10);
    }

    //Total harga
    public double Hitung(double HargaBarang, int Quantity)
    {
        return HargaBarang * Quantity - (((HargaBarang * Quantity) / 100) * 10);
    }
}
