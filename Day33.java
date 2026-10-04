import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = caca.nextInt();

        if (nilai >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }

    }
}
