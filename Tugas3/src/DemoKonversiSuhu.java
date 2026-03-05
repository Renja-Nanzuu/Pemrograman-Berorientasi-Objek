import java.util.Scanner;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        double celsius;
        KonversiSuhu1 konv = new KonversiSuhu1();
        
        // New Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam Celsius : ");
        celsius = input.nextDouble();
        
        // proses
        System.out.println(konv.celsiusToFarenheit(celsius));
        System.out.println(konv.celciusToReamur(celsius));
        System.out.println(konv.fahrenheitToReamur(konv.celsiusToFarenheit(celsius)));
    }
}