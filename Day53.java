
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        int angka;

        do {
            System.out.print("Masukkan angka (Ketik 0 untuk berhenti): ");
            angka = caca.nextInt();

            System.out.println("Anda memasukkan angka: " + angka);

        } while (angka != 0);

        System.out.println("Program dihentikan.");
    }
}
