public class ProsesNilai {
    
    public double KonversiNilaiAbsen(int jumlahAbsen) {
        return ((double) jumlahAbsen / 14) * 100;
    }
    
    double nilaiAkhir(int jumlahAbsen, int nilaiTugas, int nilaiUts, int nilaiUas) {
        double nilaiAbsenAkhir = KonversiNilaiAbsen(jumlahAbsen) * 0.10f;
        double nilaiTugasAkhir = (double) nilaiTugas * 0.20f;
        double nilaiUtsAkhir = (double) nilaiUts * 0.30f;
        double nilaiUasAkhir = (double) nilaiUas * 0.40f;
        return nilaiTugasAkhir + nilaiUtsAkhir + nilaiUasAkhir + nilaiAbsenAkhir;
    }
    
    String KonversiGrade(int jumlahAbsen, int nilaiTugas, int nilaiUts, int nilaiUas) {
        String grade;
        String ket; 
        
        double na = Math.round(nilaiAkhir(jumlahAbsen, nilaiTugas, nilaiUts, nilaiUas) * 100.0) / 100.0;
        
        if (na >= 76 && na <= 100) {
            grade = "A";
            ket = "ISTIMEWA!";
        } else if (na >= 66 && na < 76) {
            grade = "B";
            ket = "BAIK";
        } else if (na >= 56 && na < 66) {
            grade = "C";
            ket = "BAIK";
        } else if (na >= 46 && na < 56) {
            grade = "D";
            ket = "KURANG";
        } else if (na > 0 && na < 46) {
            grade = "E";
            ket = "KURANG SEKALI";
        } else {
            grade = "Tidak Valid";
            ket = "Nilai di luar jangkauan";
        }
        return "Grade       : " + grade + "\n" + "Keterangan  : " + ket;
    }
    
    void Output(String NPM, String nama, int jumlahAbsen, int nilaiTugas, int nilaiUts, int nilaiUas) {
        double na = Math.round(nilaiAkhir(jumlahAbsen, nilaiTugas, nilaiUts, nilaiUas) * 100.0) / 100.0;

        System.out.println("NPM         : " + NPM);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai AKhir : " + na);
        System.out.println(KonversiGrade(jumlahAbsen, nilaiTugas, nilaiUts, nilaiUas));
    }
}
