package OOP2ndSemester.UTS.NoEmpatSingleInheritance.src;

public class Guru extends Pendidik
{
    //Class's method
    public double Tunjangan()
    {
        if(getStatus() == 'T')
        {
            return 0.035 * getGaji();

        } else
        {
            return 0.03 * getGaji();
        }
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
