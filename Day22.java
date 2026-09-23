import java.util.Scanner;

public class TukarVariabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, temp;

        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();

        System.out.print("Masukkan nilai y: ");
        y = input.nextInt();

        System.out.println("\nSebelum ditukar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("\nSetelah ditukar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
