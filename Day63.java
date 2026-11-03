import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {

        Scanner caca = new Scanner(System.in);

        int m, n, hasil = 1;

        System.out.print("Masukkan nilai M: ");
        m = caca.nextInt();

        System.out.print("Masukkan nilai N: ");
        n = caca.nextInt();

        for (int i = 1; i <= n; i++) {
            hasil = hasil * m;
        }

        System.out.println(m + " pangkat " + n + " = " + hasil);

  
    }
}
