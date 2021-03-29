package SemesterDua.PertemuanEmpat.src.TugasSatu;

public class clsPenyewa
{
    String idPenyewa;
    String nama;
    String alamat;
    String noKTP;
    String noTelepon;
    String jenisKendaraan;
    String noPlat;
    int lamaSewa;
    int biayaSewa;

    double TotalSewa(int lamaSewa, int biayaSewa)
    {
        return lamaSewa * biayaSewa;
    }

    double PotonganHarga(int lamaSewa, int biayaSewa)
    {
        if(lamaSewa >= 7)
        {
            return 0.05 * TotalSewa(lamaSewa, biayaSewa);

        } else if(lamaSewa >= 5)
        {
            return 0.03 * TotalSewa(lamaSewa, biayaSewa);

        } else if(lamaSewa >= 3)
        {
            return 0.02 * TotalSewa(lamaSewa, biayaSewa);

        } else
        {
            return 0;
        }
    }

    double PPN(int lamaSewa, int biayaSewa)
    {
        return 0.02 * TotalSewa(lamaSewa, biayaSewa);
    }

    double HarusBayar(int lamaSewa, int biayaSewa)
    {
        return TotalSewa(lamaSewa, biayaSewa) - PotonganHarga(lamaSewa, biayaSewa) + PPN(lamaSewa, biayaSewa);
    }
}
