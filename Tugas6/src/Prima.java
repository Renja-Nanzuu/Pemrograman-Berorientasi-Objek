public class Prima {
    int num;
    public Prima(int n) {
        this.num = n;
    }
    
    void cekPrima() {
        for(int i=2; i<=num; i++) {
            boolean isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            
            if(isPrima) {
                System.out.print(i + " ");
            } 
        }
    }
}