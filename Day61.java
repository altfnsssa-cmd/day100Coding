
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        int N, hasil = 1;

        System.out.print("Masukkan nilai N: ");
        N = caca.nextInt();

        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil perkalian 1 sampai " + N + " = " + hasil);
    }
}
