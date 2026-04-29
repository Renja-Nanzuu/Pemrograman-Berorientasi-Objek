public class GanjilGenap {
    int angka;
    public GanjilGenap(int n) {
        this.angka = n;
    }
    
    void CekGanjil() {
        for(int i=0; i<=angka; i++) {
            boolean ganjil = false;
            if(i%2==1) {
                ganjil = true;
            }
            
            if(ganjil) {
                System.out.print(i+" ");
            }
        }
    }
    
    void CekGenap() {
        for(int i=0; i<=angka; i++) {
            boolean genap = false;
            if(i%2==0) {
                genap = true;
            }
            
            if(genap) {
                System.out.print(i+" ");
            }
        }
    }
}
