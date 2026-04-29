public class TabelPerkalian {
    int Tbl;
    public TabelPerkalian(int n) {
        this.Tbl = n;
    }
    
    void Tabel() {
        for(int i=1; i<=Tbl; i++) {
            for(int j=1; j<=Tbl; j++) {
                System.out.print((i*j) + "\t");
            }
            System.out.println("");
        }
    }
}
