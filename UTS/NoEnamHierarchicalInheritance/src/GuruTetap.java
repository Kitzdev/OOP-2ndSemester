package SemesterDua.UTS.NoEnamHierarchicalInheritance.src;

public class GuruTetap extends Pendidik
{
    public double Tunjangan()
    {
        return 0.05 * getGaji();
    }

    public double PajakPenghasilan()
    {
        return 0.015 * getGaji();
    }

    public double TotalGaji()
    {
        return getGaji() + Tunjangan() - PajakPenghasilan();
    }
}
