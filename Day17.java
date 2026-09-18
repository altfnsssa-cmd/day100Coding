import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan uaung awal: ");
        int uang = input.nextInt();

        System.out.println("Uang awal: Rp"+ uang);

        uang += 10000;
        System.out.println("Setelalh mendapat tambahan Rp10.000: Rp"+ uang);

        uang -= 15000;
        System.out.println("Setelah membeli barang Rp15.000: "+ uang);

        uang *= 2;
        System.out.println("Setelah uang dikalil 2: Rp"+ uang);

        uang /= 5;
        System.out.println("Setelah uang dibagi 5:Rp"+ uang);

        uang %= 3000;
        System.out.println("Setelah pembagian uang 3000: Rp"+ uang);
    }
}
