import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);


        System.out.print("Masukkan angka: ");
        int angka = caca.nextInt();

        angka++;
        System.out.println("Setelah increment: " + angka);

        angka--;
        System.out.println("Setelah decrement: " + angka);
    }
}
