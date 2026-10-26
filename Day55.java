import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        int angka = caca.nextInt();

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = caca.nextInt();

            if (angka == 0) {
                System.out.println("Program berhenti!");
                break;
            }

            if (angka < 0) {
                System.out.println("Angka negatif dilewati!");
                return;
            }

            System.out.println("Angka: " + angka);
        }
    }
}
