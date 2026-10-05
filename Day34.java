import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {

        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = caca.nextInt();

        if (nilai >= 85) {
            System.out.println("Predikat: A");
            System.out.println("Keterangan: Sangat Baik ");

        } else if (nilai >= 75) {
            System.out.println("Predikat: B");
            System.out.println("Keterangan: Baik ");

        } else if (nilai >= 75) {
            System.out.println("Predikat: C");
            System.out.println("Keterangan: Cukup ");

        } else if (nilai >= 75) {
            System.out.println("Predikat: D");
            System.out.println("Keterangan: Kurang ");

        } else if (nilai >= 75) {
            System.out.println("Predikat: E");
            System.out.println("Keterangan: Tidak lulus ");
        }
    }
}
