import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan Nomor Tiket: ");
        int nomor = caca.nextInt();

        String loket = (nomor == 0)
                ? "Tiket Tidak Valid"
                : (nomor % 2 == 0)
                ? "Loket A"
                : "Loket B";

        System.out.println("Silakan menuju ke: " + loket);

    }
}
