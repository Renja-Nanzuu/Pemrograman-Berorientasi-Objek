public class TekKotekProses {
    int ulang;
    public TekKotekProses(int n) {
        this.ulang = n;
    }
    
    void TekKotek () {
        for(int i=ulang; i>0; i--) {
            if(i%2==0) {
                System.out.println("\nTek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek\n");
            }
            
            System.out.println("Anak ayam turun lah " + i);
            if(i==1) {
                System.out.println("Mati satu tinggal Induknya");
            } else {
                System.out.println("Mati satu tinggal lah " + (i-1));
            }
        }
    }
}
