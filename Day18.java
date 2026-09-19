import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        long hasil = angka;

        System.out.println("Nilai int : "+ angka);
        System.out.println("Nilai long :"+ hasil);

    }
}
