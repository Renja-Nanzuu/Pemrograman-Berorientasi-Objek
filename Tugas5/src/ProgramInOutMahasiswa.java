import java.util.Scanner;

public class ProgramInOutMahasiswa {
    public static void main(String[] args) {
        ProsesNilai nilai = new ProsesNilai();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("== Program In/Out Mahasiswa ==");
        
        // Inputting..
        System.out.print("Masukkan NIM: ");
        String NPM = input.nextLine();
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
    
        nilai.Output(NPM, nama, jumlahAbsen, nilaiTugas, nilaiUts, nilaiUas);
    }
}
