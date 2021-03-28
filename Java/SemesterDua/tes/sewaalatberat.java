package SemesterDua.tes;

public class sewaalatberat 
{
    private String kodealatberat;
    private String namaalatberat;
    private int  biayasewaperjam;
    private double lamasewaperjam;
    private String namapenyewa;
    private String noktppenyewa;
            

    public String getKodealatberat() {
        return kodealatberat;
    }

    public void setKodealatberat(String kodealatberat) {
        this.kodealatberat = kodealatberat;
    }

    public String getNamaalatberat() {
        return namaalatberat;
    }

    public void setNamaalatberat(String namaalatberat) {
        this.namaalatberat = namaalatberat;
    }

    public int getBiayasewaperjam() {
        return biayasewaperjam;
    }

    public void setBiayasewaperjam(int biayasewaperjam) {
        this.biayasewaperjam = biayasewaperjam;
    }

    public double getLamasewaperjam() {
        return lamasewaperjam;
    }

    public void setLamasewaperjam(double lamasewaperjam) {
        this.lamasewaperjam = lamasewaperjam;
    }

    public String getNamapenyewa() {
        return namapenyewa;
    }

    public void setNamapenyewa(String namapenyewa) {
        this.namapenyewa = namapenyewa;
    }

    public String getNoktppenyewa() {
        return noktppenyewa;
    }

    public void setNoktppenyewa(String noktppenyewa) {
        this.noktppenyewa = noktppenyewa;
    } 
    public int SubTotalSewa(){
    return (int) (biayasewaperjam*lamasewaperjam);
}
    public double potonganharga(){
    if(lamasewaperjam < 12){
        return 0;
    }
        return lamasewaperjam* 0.05;
    }

    
    public double totalbiaya(){
            return SubTotalSewa()- potonganharga();
            
}
  
}