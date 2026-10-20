
import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = caca.nextInt();

        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil: " + hasil);

    }
}
