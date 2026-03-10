public class DemoBalok {
    public static void main(String[] args) {
        Balok B = new Balok(2, 5, 10);
        System.out.println("Operasi Hitung V dan LP Balok");
        System.out.println("Volume Balok: " + B.VolumeBalok());
        System.out.println("Luas Permukaan Balok: " + B.LPBalok());
    }
}
