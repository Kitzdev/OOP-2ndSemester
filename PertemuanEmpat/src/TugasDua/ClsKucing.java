package OOP2ndSemester.PertemuanEmpat.src.TugasDua;

public class ClsKucing
{
    String warnaBulu;
    float beratBadan;
    float tinggiBadan;

    ClsKucing(String warnaBulu, float beratBadan, float tinggiBadan)
    {
        this.warnaBulu = warnaBulu;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    void Makan(float makanan)
    {
        beratBadan += makanan;
    }

    void Lari(float kurang)
    {
        beratBadan -= kurang;
    }

    void CheckStatusKucing()
    {
        System.out.println("Warna bulu kucing: " + warnaBulu);
        System.out.println("Berat badan kucing: " + beratBadan);
        System.out.println("Tinggi badan kucing: " + tinggiBadan);
    }
}
