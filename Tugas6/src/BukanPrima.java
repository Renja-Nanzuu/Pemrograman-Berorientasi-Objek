public class BukanPrima {
    int num;
    public BukanPrima(int n) {
        this.num = n;
    }
    
    void cekBukanPrima() {
        for(int i=0; i<=num; i++) {
            boolean isPrima = true;

            if (i <= 1) {
                isPrima = false; 
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrima = false;
                        break;
                    }
                }
            }
            
            if(!isPrima) {
                System.out.print(i + " ");
            } 
        }
    }
}
