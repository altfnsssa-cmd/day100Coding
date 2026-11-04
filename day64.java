
import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {

        Scanner caca = new Scanner(System.in);

        int n, faktorial = 1;

        System.out.print("Masukkan angka: ");
        n = caca.nextInt();

        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }

        System.out.println("Hasil faktorial dari " + n + " adalah " + faktorial);

    }
}
