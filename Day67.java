
import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        int n;

        System.out.print("Masukkan ukuran persegi: ");
        n = caca.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
