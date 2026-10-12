
import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan temperatur ruangan: ");
        double suhu = caca.nextDouble();

        if (suhu >= 35) {
            System.out.println("Temperatur sangat panas");
        } else if (suhu >= 30) {
            System.out.println("Temperatur panas");
        } else if (suhu >= 20) {
            System.out.println("Temperatur sejuk");
        } else {
            System.out.println("Temperatur dingin");
        }

    }
}
