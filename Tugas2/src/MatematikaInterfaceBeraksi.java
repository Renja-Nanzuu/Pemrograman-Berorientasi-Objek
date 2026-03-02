public class MatematikaInterfaceBeraksi {
    public static void main (String[]args) {
            /* == New Object - Nilai == */
            MatematikaInterfaceClass Mtk = new MatematikaInterfaceClass();

            /* == Tampilan == */
            System.out.println("== Operasi Hitung sederhana by Nanzuudgx #2 ==");

            /* == Pemanggilan Method sekaligus Hasilnya == */
            System.out.println("== Hasil hitung! ==");
            System.out.println(" Pertambahan : 20 + 10 = " + Mtk.Pertambahan(20, 10));
            System.out.println(" Pengurangan : 10 - 5  = " + Mtk.Pengurangan(10, 5));
            System.out.println(" Perkalian   : 10 * 3  = " + Mtk.Perkalian(10, 3));
            System.out.println(" Pembagian   : 21 / 2  = " + Mtk.Pembagian(21, 2));
    }
}
