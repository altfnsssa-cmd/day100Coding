import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        double suhu = caca.nextDouble();

        System.out.println("Suhu: " + suhu + "°C");

        if (suhu >= 30) {
            if (suhu >= 35) {
                System.out.println("Kondisi: Sangat Panas");
            } else {
                System.out.println("Kondisi: Panas");
            }
        } else {
            if (suhu >= 20) {
                System.out.println("Kondisi: Sejuk");
            } else {
                System.out.println("Kondisi: Dingin");
            }
    }
}
