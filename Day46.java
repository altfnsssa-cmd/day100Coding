import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.println("=== DAFTAR MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng  - Rp 15000");
        System.out.println("2. Mie Ayam     - Rp 18000");
        System.out.println("3. Bakso        - Rp 12000");
        System.out.println("4. Sate         - Rp 16000");
        System.out.println("5. Ayam Geprek  - Rp 10000");

        System.out.print("Masukkan nomor menu pilihan Anda: ");
        int pilihan = caca.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Menu: Nasi Goreng");
                System.out.println("Harga: Rp 15000");
                break;

            case 2:
                System.out.println("Menu: Mie Ayam");
                System.out.println("Harga: Rp 18000");
                break;

            case 3:
                System.out.println("Menu: Bakso");
                System.out.println("Harga: Rp 12000");
                break;

            case 4:
                System.out.println("Menu: Sate");
                System.out.println("Harga: Rp 16000");
                break;

            case 5:
                System.out.println("Menu: Ayam Geprek");
                System.out.println("Harga: Rp 10000");
                break;

            default:
                System.out.println("Menu Tidak Tersedia");
        }
    }
}
