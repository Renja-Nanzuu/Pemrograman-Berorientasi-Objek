class NilaiBau {
    String nama;
    String NPM;
    double nAbsen, nTugas, nUts, nUas, nAkhir;
    
    void ProsesNilai () {
        nama = "Aji Pisang";
        NPM = "2510631170026";
        nAbsen = 100;
        nTugas = 90;
        nUts = 86;
        nUas = 90;
        nAkhir = (nAbsen * 0.10) + (nTugas * 0.20) + (nUts * 0.30) + (nUas * 0.40);
    }
    
    void CetakNilai () {
        System.out.println("NIM         : " + NPM);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Absen : " + nAbsen);
        System.out.println("Nilai Tugas : " + nTugas);
        System.out.println("Nilai UTS   : " + nUts);
        System.out.println("Nilai UAS   : " + nUas);
        System.out.println("Nilai Akhir : " + nUas);
    }
}

public class JAWA {
    public static void main(String[]args) {
        NilaiBau Snickers = new NilaiBau();
        
        Snickers.ProsesNilai();
        Snickers.CetakNilai();
    }
}