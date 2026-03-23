public class ProsesIMT {
    double IMT(double berat, double tinggi) {
        tinggi = tinggi / 100; // konversi cm → meter
        return berat / (tinggi * tinggi);
    }
    
    String Ket(double berat, double tinggi) {
        double imt = Math.round(IMT(berat, tinggi) * 100.0) / 100;
        String ket;
        
        if (imt > 40) {
            ket = "SangatGemuk!";
        } else if (imt >= 30 && imt < 40) {
            ket = "Gemuk!";
        } else if (imt >= 25 && imt < 30) {
            ket = "BeratBadanLebih";
        } else if (imt >= 18.5 && imt < 25) {
            ket = "BeratBadanIdeal";
        } else if (imt < 18.5) {
            ket = "BeratBadanKurang";
        } else {
            ket = "Tidak ada yang sesuai!";
        }
        
        return ket;
    }
    
    void Output(String Nama, double berat, double tinggi) {
        double imt = Math.round(IMT(berat, tinggi) * 100.0) / 100;
        System.out.println("Nama       : " + Nama);
        System.out.println("Berat      : " + berat);
        System.out.println("Tinggi     : " + tinggi);
        System.out.println("Nilai IMT  : " + imt);
        System.out.println("Keterangan : " + Ket(berat, tinggi));
    }
}
