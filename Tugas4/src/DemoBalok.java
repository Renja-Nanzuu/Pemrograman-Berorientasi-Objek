public class DemoBalok {
    public static void main(String[] args) {
        Balok B1 = new Balok(2, 5, 10);
        Balok B2 = new Balok(3, 10);
        System.out.println("Operasi Hitung V dan LP Balok 1");
        System.out.println("Volume Balok: " + B1.VolumeBalok());
        System.out.println("Luas Permukaan Balok: " + B1.LPBalok() + "\n");
        
        System.out.println("Operasi Hitung V dan LP Balok 2");
        System.out.println("Volume Balok: " + B2.VolumeBalok());
        System.out.println("Luas Permukaan Balok: " + B2.LPBalok());
    }
}
