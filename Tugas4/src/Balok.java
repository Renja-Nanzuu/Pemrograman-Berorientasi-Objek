public class Balok {
    double panjang;
    double lebar;
    double tinggi;
    
    public Balok(double p, double l, double t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
    public double VolumeBalok() {
        return panjang*lebar*tinggi;
    }
    public double LPBalok() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}
