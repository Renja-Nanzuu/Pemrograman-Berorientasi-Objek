public class ProsesHarga {
    double besarPotongan(int harga) {
        double potongan;
        if (harga < 50000) {
            potongan = harga * 0.05;
        } else if (harga >= 50000) {
            potongan = harga * 0.2;
        } else {
            potongan = harga * 1;
        }
        
        double Potong = Math.round(potongan * 100.0) / 100.0;
        return Potong;
    }
    
    void Output(String Nama, int harga) {
        double jumlahHarga = harga - besarPotongan(harga);
        
        System.out.println("Nama Pelanggan             : " + Nama);
        System.out.println("Besar Potongan             : " + besarPotongan(harga));
        System.out.println("Jumlah yg harus dibayarkan : " + jumlahHarga);
    }
}
