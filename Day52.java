
import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = caca.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(i + " x " + angka + " = " + (i * angka));
            i++;
        }
    }
}
