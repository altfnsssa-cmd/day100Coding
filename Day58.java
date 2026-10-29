
import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = caca.nextInt();

        System.out.println("Angka ganjil N-1:");
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap N-1:");
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
