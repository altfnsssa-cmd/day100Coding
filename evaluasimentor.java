import java.util.Scanner;

public class evaluasi1 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        int kategori, jumlah;
        int harga = 0;
        String namaKategori = "";
        double total, diskon = 0, totalBayar;

        System.out.println("=== PEMBELIAN TIKET WAHANA BERMAIN ===");
        System.out.println("1. Reguler - Rp50000");
        System.out.println("2. Express - Rp80000");
        System.out.println("3. VIP     - Rp120000");

        System.out.print("Pilih kategori (1-3): ");
        kategori = caca.nextInt();

        if (kategori == 1) {
            namaKategori = "Reguler";
            harga = 50000;
        } else if (kategori == 2) {
            namaKategori = "Express";
            harga = 80000;
        } else if (kategori == 3) {
            namaKategori = "VIP";
            harga = 120000;
        } else {
            System.out.println("Kategori tidak tersedia");
            caca.close();
            return;
        }

        System.out.print("Jumlah tiket: ");
        jumlah = caca.nextInt();

        total = harga * jumlah;

        if ((kategori == 3 && jumlah >= 2)
                || (total >= 250000)) {
            diskon = total * 0.20;
        }

        totalBayar = total - diskon;

        System.out.println("\n=== OUTPUT ===");
        System.out.println("Kategori: " + namaKategori);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: Rp" + total);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + totalBayar);
    }
}
