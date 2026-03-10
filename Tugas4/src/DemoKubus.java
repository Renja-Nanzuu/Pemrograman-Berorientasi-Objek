public class DemoKubus {
    public static void main(String[] args) {
        Kubus K = new Kubus(7);
        System.out.println("Operasi Hitung V dan LP Kubus");
        System.out.println("Volume Balok: " + K.VolumeKubus());
        System.out.println("Luas Permukaan Balok: " + K.LPKubus());
    }
}
