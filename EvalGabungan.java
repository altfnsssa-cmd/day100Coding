import java.util.Scanner;

public class eval {
    public static void main(String[] args) {
        Scanner caca = new Scanner (System.in);

        //soal 1
        int N = caca.nextInt();

        for (int i = 1; i <= N; i++) {
            if ((i % 3 == 0 && i % 4 != 0) ||
                (i % 4 == 0 && i % 3 != 0)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //soal 2
        double N = caca.nextDouble();

        if (N % 1 != 0) {
            System.out.println("Pecahan");
        } else if ((int) N % 2 == 0) {
            System.out.println("Bulat Genap");
        } else {
            System.out.println("Bulat Ganjil");
        }

        if (N > 0) {
            System.out.println("Positif");
        } else if (N < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Netral");
        }

        if (N >= 0 && N % 1 == 0) {
            System.out.println("Natural/Cacah");
        }

        //soal 3
        int X = caca.nextInt();
        int Y = caca.nextInt();
        int Z = caca.nextInt();

        if (Y > X) {
            X++;
        } else if (Y < X) {
            X--;
        }

        if (Z > X) {
            X += 2;
        } else if (Z < X) {
            X -= 2;
        }

        System.out.println(X);

    }
}
