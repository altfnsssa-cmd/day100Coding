import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        String umurString =
    String.valueOf(umur);

        System.out.println("Umur dalam int: "+ umur);
        System.out.println("Umur dalam String: "+ umurString);
    }
}
