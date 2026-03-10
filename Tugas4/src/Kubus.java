public class Kubus {
    double sisi;
    
    public Kubus(double s) {
        this.sisi = s;
    }
    public double VolumeKubus() {
        return sisi*sisi*sisi;
    }
    public double LPKubus() {
        return 6*sisi*sisi;
    }
}
