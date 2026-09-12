import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Lagu Favorit ===");

        System.out.println("Judul: ");
        String judul = input.nextLine();

        System.out.println("Penyanyi: ");
        String penyanyi = input.nextLine();

        System.out.println("Lirik: ");
        String Lirik = input.nextLine();

        System.out.println("\n=== Lagu Favorit ===");
        System.out.println("Judul: " + judul);
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Lirik: " + Lirik);
    }
}
