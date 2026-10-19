
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        double angka1 = caca.nextDouble();

        System.out.print("Operator (+, -, *, /, %): ");
        char operator = caca.next().charAt(0);

        System.out.print("Angka kedua: ");
        double angka2 = caca.nextDouble();

        double hasil = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;

            case '-':
                hasil = angka1 - angka2;
                break;

            case '*':
                hasil = angka1 * angka2;
                break;

            case '/':
                if (angka2 == 0) {
                    System.out.println(
                        "Pembagian dengan nol tidak dapat dilakukan."
                    );
                    valid = false;
                } else {
                    hasil = angka1 / angka2;
                }
                break;

            case '%':
                if (angka2 == 0) {
                    System.out.println(
                        "Pembagian dengan nol tidak dapat dilakukan."
                    );
                    valid = false;
                } else {
                    hasil = angka1 % angka2;
                }
                break;

            default:
                System.out.println("Operator tidak valid.");
                valid = false;
                break;
        }

        if (valid) {
            System.out.println("===Kalkulator Sederhana===");
            System.out.println("Hasil dari " + angka1 + " "
                    + operator + " " + angka2 + " adalah " + hasil);
        }
    }
}
