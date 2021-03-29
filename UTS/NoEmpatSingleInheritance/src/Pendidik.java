package SemesterDua.UTS.NoEmpatSingleInheritance.src;

public class Pendidik 
{
    private String NIK;
    private String Nama;
    private char JenisKelamin;
    private char Status;
    private double Gaji;

    public void setNIK(String NIK)
    {
        this.NIK = NIK;
    }

    public String getNIK()
    {
        return this.NIK;
    }

    public void setNama(String Nama)
    {
        this.Nama = Nama;
    }

    public String getNama()
    {
        return this.Nama;
    }

    public void setJenisKelamin(char JenisKelamin)
    {
        this.JenisKelamin = JenisKelamin;
    }

    public char getJenisKelamin()
    {
        return this.JenisKelamin;
    }

    public void setStatus(char Status)
    {
        this.Status = Status;
    }

    public char getStatus()
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
