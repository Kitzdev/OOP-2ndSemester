package SemesterDua.UTS.NoLimaMultilevelInheritance.src;

public class Spesialis extends Dokter
{
    public double TotalJamPraktek;

    public double TunjanganSpesialis()
    {
        return 0.1 * Gaji * TotalJamPraktek;
    }
}
