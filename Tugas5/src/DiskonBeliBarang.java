import java.util.Scanner;

public class DiskonBeliBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ProsesHarga Pe = new ProsesHarga();
        
        System.out.print("Masukkan Nama Pelanggan: ");
        String Nama = input.nextLine();
        System.out.print("Masukkan total harga   : ");
        int harga = input.nextInt();
        
        Pe.Output(Nama, harga);
    }
}
