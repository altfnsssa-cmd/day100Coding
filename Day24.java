import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang karpet: ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar karpet: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;

        System.out.println("Panjang karpet: "+ panjang + " meter ");
        System.out.println("Lebar karpet: "+ lebar + " meter ");
        System.out.println("Luas karpet: "+ luas + "m2");
    }
}
