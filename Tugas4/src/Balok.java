public class Balok {
    double panjang, lebar, tinggi;

    public Balok(double p, double l, double t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
    public Balok(double p, double l) {
        this.panjang = p;
        this.lebar = l;
        tinggi = 5;
    }
    public double VolumeBalok() {
        return panjang*lebar*tinggi;
    }
    public double LPBalok() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}
