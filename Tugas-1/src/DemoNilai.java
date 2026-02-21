import java.util.Scanner;

public class DemoNilai {
    public static void main(String[]args) {
        /* == New Object - Nilai == */
        Nilai nilaiMhs = new Nilai();
        
        /* == Tampilan == */
        System.out.println("== Input Nilai Sederhana by Nanzuudgx ==");
        
        /* == User Input == */
        // New Scanner
        Scanner input = new Scanner(System.in);
        
        // Inputting..
        System.out.print("Masukkan NIM: ");
        String NIM = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah Kehadiran (1-14): ");
        int jumlahAbsen = input.nextInt();
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUts = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUas = input.nextInt();
        
        /* == Tampilan == */
        System.out.println("");
        System.out.println("== Nilai Reveal! ==");
        
        /* == Calling Methods == */
        nilaiMhs.CetakNilai(NIM, nama, jumlahAbsen, nilaiTugas, nilaiUts, nilaiUas);
        
        /* == Tampilan == */
        System.out.println("====================");
    }
}
