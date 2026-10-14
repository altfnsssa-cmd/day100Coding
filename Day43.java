
import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = caca.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Bukan kelipatan 3 atau 5");
        }

    }
}
