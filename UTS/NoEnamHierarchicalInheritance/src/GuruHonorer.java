package OOP2ndSemester.UTS.NoEnamHierarchicalInheritance.src;

public class GuruHonorer extends Pendidik
{
    public double Tunjangan()
    {
        return 0.02 * getGaji();
    }

    public double TotalGaji()
    {
        return getGaji() + Tunjangan();
    }
}
