import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah permen: ");
        int permen = input.nextInt();

        System.out.println("Masukkan jumlah orang ");
        int orang = input.nextInt();
        int sisa = permen % orang;

        System.out.println("Jumlah permen: "+ permen);
        System.out.println("Jumlah orang: "+ orang);
        System.out.println("Sisa permen: "+ sisa);
    }
}
