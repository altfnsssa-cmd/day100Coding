import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        String nama;
        int nilai;
        String predikat;
        String status;

        System.out.print("Masukkan nama: ");
        nama = caca.nextLine();

        System.out.print("Masukkan nilai: ");
        nilai = caca.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            if (nilai >= 85) {
                predikat = "A";
            } else if (nilai >= 75) {
                predikat = "B";
            } else if (nilai >= 65) {
                predikat = "C";
            } else if (nilai >= 50) {
                predikat = "D";
            } else {
                predikat = "E";
            }

            if (nilai >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }

            System.out.println("\nNama : " + nama);
            System.out.println("Nilai : " + nilai);
            System.out.println("Predikat Nilai : " + predikat);
            System.out.println("Status = " + status);
        }
    }
}
