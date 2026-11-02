
import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        int baris, kolom;

        System.out.print("Masukkan jumlah baris: ");
        baris = caca.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        kolom = caca.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print((i + j) + " ");
            }
            System.out.println();
        }
    }
}
