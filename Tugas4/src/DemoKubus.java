public class DemoKubus {
    public static void main(String[] args) {
        Kubus K1 = new Kubus(7);
        Kubus K2 = new Kubus();
        System.out.println("Operasi Hitung V dan LP Kubus 1");
        System.out.println("Volume Balok: " + K1.VolumeKubus());
        System.out.println("Luas Permukaan Balok: " + K1.LPKubus() + "\n");
        
        System.out.println("Operasi Hitung V dan LP Kubus 2");
        System.out.println("Volume Balok: " + K2.VolumeKubus());
        System.out.println("Luas Permukaan Balok: " + K2.LPKubus());
    }
}
