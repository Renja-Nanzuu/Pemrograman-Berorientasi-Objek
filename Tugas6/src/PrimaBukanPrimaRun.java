public class PrimaBukanPrimaRun {
    public static void main(String[] args) {
        Prima P = new Prima(20);
        BukanPrima Bp = new BukanPrima(20);
        
        System.out.print("Bilangan Prima dari 0 - 20 adalah : ");
        P.cekPrima();
        System.out.print("\nBilangan BukanPrima dari 0 - 20 adalah : ");
        Bp.cekBukanPrima();
    }
}
