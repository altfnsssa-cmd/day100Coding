
import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {

        Scanner caca = new Scanner(System.in);

        int M, N;

        System.out.print("Masukkan nilai M: ");
        M = caca.nextInt();

        System.out.print("Masukkan nilai N: ");
        N = caca.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + ":");

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.println(i);
            }
        }
    }
}
