import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {

        Scanner caca = new Scanner(System.in);
        System.out.print("umur orang pertama: ");
        int umur1 = caca.nextInt();

        System.out.print("umur orang kedua: ");
        int umur2 = caca.nextInt();

        System.out.println("Apakah umur sama? " + (umur1 == umur2));
        System.out.println("Apakah kedua umur berbeda? " + (umur1 != umur2));
    }
}
