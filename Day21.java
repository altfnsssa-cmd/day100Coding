import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        String hargaString = input.nextLine();

        System.out.println("Masukkan jumlah barang: ");
        String jumlahString = input.nextLine();

        double harga =
    Double.parseDouble(hargaString);
        int jumlah =
    Integer.parseInt(jumlahString);

    double total = harga * jumlah;

    System.out.println("\n=== STRUK BELANJA ===");

    System.out.println("Nama barang : "+nama);
    System.out.println("Harga barang : Rp"+ harga);
    System.out.println("Jumlah barang : "+ jumlah);
    System.out.println("Total harga : Rp"+ total); 
    } 
}
