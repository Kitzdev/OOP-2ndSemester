import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        boolean isLoop;
        int userAnswerI;    //Save user's integer type input
        double userAnswerD; //Save user's double type input
        String userAnswerS; //Save user's string type input
        String containerS;
        Scanner scanner = new Scanner(System.in);
        Rental objrental = new Rental();

        //Declare rupiah format
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setGroupingSeparator('.');
        formatRp.setMonetaryDecimalSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println("===========================================");
        System.out.println("Selamat Datang di program penghitung biaya!");
        System.out.println("===========================================");

        do
        {
            isLoop = false;

            //Input data from user
            System.out.print("\nMasukkan nomor plat kendaraan Anda: ");
            userAnswerS = scanner.nextLine();
            objrental.setNoPlat(userAnswerS);
            
            System.out.println("\nMasukkan Jenis Kendaraan: ");
            System.out.print("Masukkan 'M' untuk minibus\nMasukkan 'B' untuk bus\nMasukkan 'T' untuk truk\n" +
                                "Jawab: ");
            userAnswerS = scanner.nextLine();

            if(userAnswerS == "M" || userAnswerS == "m")
            {
                objrental.setJenisKendaraan("M");
                containerS = "Minibus";

            } else if(userAnswerS == "B" || userAnswerS == "b")
            {
                objrental.setJenisKendaraan("B");
                containerS = "Bus";

            } else
            {
                objrental.setJenisKendaraan("T");
                containerS = "Truk";
            }

            System.out.print("\nMasukkan biaya sewa kendaraan: ");
            userAnswerD = scanner.nextDouble();
            objrental.setBiayaSewa(userAnswerD);

            System.out.print("Masukkan lama sewa kendaraan: ");
            userAnswerI = scanner.nextInt();
            objrental.setLamaSewa(userAnswerI);

            //Display data to user
            System.out.println("\n===========================================");
            System.out.println("Berikut ditampilkan informasi pembayaran: ");
            
            userAnswerS = objrental.getNoPlat();
            System.out.println("Nomor plat     : " + userAnswerS);

            userAnswerS = objrental.getJenisKendaraan();
            System.out.println("Jenis kendaraan: " + containerS);

            userAnswerD = objrental.getBiayaSewa();
            System.out.println("Biaya sewa     : " + kursIndonesia.format(userAnswerD));

            userAnswerI = objrental.getLamaSewa();
            System.out.println("Lama sewa      : " + userAnswerI);

            userAnswerD = objrental.SubTotal();
            System.out.println("Sub total      : " + kursIndonesia.format(userAnswerD));

            userAnswerD = objrental.JumlahDiskon();
            System.out.println("Jumlah diskon  : " + kursIndonesia.format(userAnswerD));

            userAnswerD = objrental.TotalBiaya();
            System.out.println("Total biaya    : " + kursIndonesia.format(userAnswerD));

            System.out.println("\n===========================================");

            //Ask user wether want to try again or not
            scanner.nextLine();
            System.out.print("Mau coba lagi [Y / T]: ");
            userAnswerS = scanner.nextLine();

            if(userAnswerS.equals("Y") || userAnswerS.equals("y"))
            {
                isLoop = true;
            }

        } while(isLoop);

        System.out.println("Terima kasih!");
        
        scanner.close();
    }
}
