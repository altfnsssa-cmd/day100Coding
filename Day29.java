import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {

        Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = caca.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = caca.nextInt();

        System.out.println("bilangan pertama < bilangan kedua: " + (bilangan1 < bilangan2));
        System.out.println("bilangan pertama > bilangan kedua: " + (bilangan1 > bilangan2));
    }
}
