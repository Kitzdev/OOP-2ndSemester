package SemesterDua.PertemuanDua.src.totalgaji;

public class clsDoctor
{
    String idDokter;    //Store doctor's ID
    String nama;        //Store doctor's name
    int gaji;           //Store doctor's salary

    //Count doctor's allowance
    public double tunjangan(int gaji)
    {
        return gaji * 0.1;
    }

    //Count doctor's total salary
    public double totalGaji(int gaji)
    {
        double tunjanganContainer = tunjangan(gaji);

        return gaji + tunjanganContainer;
    }
}
