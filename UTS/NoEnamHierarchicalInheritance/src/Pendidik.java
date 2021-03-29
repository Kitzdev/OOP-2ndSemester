package SemesterDua.UTS.NoEnamHierarchicalInheritance.src;

public class Pendidik 
{
    private String NIK;
    private String Nama;
    private String JenisKelamin;
    private String Status;
    private double Gaji;

    public void setNIK(String NIK)
    {
        this.NIK = NIK;
    }

    public String getNIK()
    {
        return NIK;
    }

    public void setNama(String Nama)
    {
        this.Nama = Nama;
    }

    public String getNama()
    {
        return this.Nama;
    }

    public void setJenisKelamin(String JenisKelamin)
    {
        this.JenisKelamin = JenisKelamin;
    }

    public String getJenisKelamin()
    {
        return this.JenisKelamin;
    }

    public void setStatus(String Status)
    {
        this.Status = Status;
    }

    public String getStatus()
    {
        return this.Status;
    }

    public void setGaji(double Gaji)
    {
        this.Gaji = Gaji;
    }

    public double getGaji()
    {
        return this.Gaji;
    }
}
