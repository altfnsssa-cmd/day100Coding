import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = input.nextDouble();

        int hasil = (int) angka;

        System.out.println("Angka awal (double) : "+ angka);
        System.out.println("Setelah dikonversi ke int : "+ hasil);

    }
}
