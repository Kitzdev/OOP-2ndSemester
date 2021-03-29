package SemesterDua.UTS.NoLimaMultilevelInheritance.src;

public class SpesialisJantung extends Spesialis
{
    public double UangPraktek()
    {
        return 0.02 * Gaji;
    }

    public double PajakPenghasilan()
    {
        return 0.025 * Gaji;
    }

    public double TotalGaji()
    {
        return Gaji + TunjanganSpesialis() + UangPraktek() - PajakPenghasilan();
    }
}
