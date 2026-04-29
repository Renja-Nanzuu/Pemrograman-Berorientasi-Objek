import java.util.Scanner;

public class TokoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah item: ");
        int n = input.nextInt();
        input.nextLine();

        String[] kode = new String[n];
        int[] jumlah = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data ke " + (i + 1));

            System.out.print("Masukkan kode: ");
            kode[i] = input.nextLine();

            System.out.print("Masukkan jumlah beli: ");
            jumlah[i] = input.nextInt();
            input.nextLine();
        }

        int totalBayar = 0;

        System.out.println("\nTOKO SERBA ADA");
        System.out.printf("%-3s %-8s %-10s %-8s %-12s %-10s\n",
            "No", "Kode", "Nama", "Harga", "Jumlah Beli", "Total"
        );
        System.out.println("======================================================");

        for (int i = 0; i < n; i++) {
            ManageBarang b = GudangToko.cariBarang(kode[i]);

            if (b != null) {
                int bayar = b.harga * jumlah[i];
                totalBayar += bayar;

                System.out.printf("%-3d %-8s %-10s %-8d %-12d %-10d\n",
                    (i+1), b.kode, b.nama, b.harga, jumlah[i], bayar
                );
            } else {
                System.out.printf("%-4d", (i+1));
                System.out.println("Barangnya gak ada!");
            }
        }

        System.out.println("======================================================");
        System.out.println("Total Bayar: " + totalBayar);
    }
}
