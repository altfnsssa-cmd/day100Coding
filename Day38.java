import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        int pilihan, jumlah;
        String kategori = "";
        int harga = 0;
        double diskon = 0;

        System.out.println("=== PEMBELIAN TIKET BIOSKOP ===");
        System.out.println("1. Regular  - Rp40000");
        System.out.println("2. Sweetbox - Rp60000");
        System.out.println("3. VIP      - Rp90000");

        System.out.print("Pilih kategori (1-3): ");
        pilihan = caca.nextInt();

        if (pilihan == 1) {
            kategori = "Regular";
            harga = 40000;
        } else if (pilihan == 2) {
            kategori = "Sweetbox";
            harga = 60000;
        } else if (pilihan == 3) {
            kategori = "VIP";
            harga = 90000;
        } else {
            System.out.println("Kategori tidak tersedia");
            caca.close();
            return;
        }

        System.out.print("Jumlah tiket: ");
        jumlah = caca.nextInt();

        int total = harga * jumlah;

        if (total >= 150000) {
            diskon = total * 0.15;
        } else {
            diskon = 0;
        }

        double totalBayar = total - diskon;

        System.out.println("\n=== OUTPUT ===");
        System.out.println("Kategori : " + kategori);
        System.out.println("Harga    : Rp" + harga);
        System.out.println("Jumlah   : " + jumlah);
        System.out.println("Total    : Rp" + total);
        System.out.println("Diskon   : Rp" + (int) diskon);
        System.out.println("Total Bayar : Rp" + (int) totalBayar);


    }
}
