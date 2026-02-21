public class Nilai {
    float KonversiNilaiAbsen(int jumlahAbsen) {
        return ((float) jumlahAbsen / 14) * 100;
    }
    
    float nilaiAkhir(int jumlahAbsen, int nilaiTugas, int nilaiUts, int nilaiUas) {
        float nilaiAbsenAkhir = KonversiNilaiAbsen(jumlahAbsen) * 0.10f;
        float nilaiTugasAkhir = (float) nilaiTugas * 0.20f;
        float nilaiUtsAkhir = (float) nilaiUts * 0.30f;
        float nilaiUasAkhir = (float) nilaiUas * 0.40f;
        return nilaiTugasAkhir + nilaiUtsAkhir + nilaiUasAkhir + nilaiAbsenAkhir;
    }
    
    void CetakNilai(String NIM, String nama, int jumlahAbsen, int nilaiTugas, int nilaiUts, int nilaiUas) {
        System.out.println("NIM         : " + NIM);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Absen : " + KonversiNilaiAbsen(jumlahAbsen));
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUts);
        System.out.println("Nilai UAS   : " + nilaiUas);
        System.out.println("Nilai Akhir : " + nilaiAkhir(jumlahAbsen, nilaiTugas, nilaiUts, nilaiUas));
    }
}
