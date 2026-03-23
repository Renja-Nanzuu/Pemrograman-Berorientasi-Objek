import java.util.Scanner;

public class TesIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ProsesIMT imt = new ProsesIMT();
        
        System.out.print("Masukkan Nama Orang   : ");
        String Nama = input.nextLine();
        System.out.print("Masukkan Berat Badan  : ");
        double berat = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan : ");
        double tinggi = input.nextDouble();
        
        imt.Output(Nama, berat, tinggi);
    }
}
