import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {

        Scanner caca = new Scanner(System.in);

        System.out.print("Tinggi badan: ");
        double tinggi = caca.nextDouble();
        double pembanding = 162.0;

        System.out.println(tinggi + " >= " + pembanding + " = " + (tinggi >= pembanding));
        System.out.println(tinggi + " <= " + pembanding + " = " + (tinggi <= pembanding));
    }
}
