import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Berat bagasi: ");
        double berat = sc.nextDouble();

        boolean kenaDenda = berat > 20 || berat < 0;
        boolean bagasiAman = !kenaDenda;

        System.out.println("Kena denda atau tidak valid? : "+ kenaDenda);
        System.out.println("Bagasi aman? : "+ bagasiAman);
        
    }
    
}
