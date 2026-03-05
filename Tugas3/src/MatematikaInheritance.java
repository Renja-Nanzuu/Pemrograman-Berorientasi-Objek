public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();

        /* == Tampilan == */
        System.out.println("== Operasi Hitung sederhana by Nanzuudgx ==");

        /* == Pemanggilan Method sekaligus Hasilnya == */
        System.out.println("== Hasil hitung! ==");
        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5  = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3  = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2  = " + mtk.pembagian(21, 2));
        System.out.println("Modulus     : 11 % 2  = " + mtk.modulus(11, 2));
    }
}
