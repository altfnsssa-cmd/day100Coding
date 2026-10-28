import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = caca.nextInt();

        System.out.println("Angka ganjil 1-" + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap 1-" + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    
    }
}
