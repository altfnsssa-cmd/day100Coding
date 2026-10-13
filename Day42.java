import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok, potongan, gajiBersih;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan potongan: ");
        potongan = input.nextDouble();

        gajiBersih = gajiPokok - potongan;

        System.out.println("Gaji bersih: " + gajiBersih);
      
    }
}
