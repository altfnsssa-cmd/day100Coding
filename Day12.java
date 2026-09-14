import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        System.out.println("nama: ");
        String nama = input.nextLine();

        System.out.println("NIM: ");
        String NIM = input.nextLine();

        System.out.println("Tinggi badan: ");
        double Tinggibadan = input.nextDouble();
        
        System.out.println("Berat badan: ");
        double Beratbadan = input.nextDouble();

        System.out.println("Status mahasiswa: ");
        boolean Statusmahasiswa = input.nextBoolean();

        System.out.println("Nama : "+ nama);
        System.out.println("NIM: "+ NIM);
        System.out.println("Tinggi badan: "+ Tinggibadan);
        System.out.println("Berat badan: "+ Beratbadan);
        System.out.println("Status mahasiswa: "+ Statusmahasiswa);

    }
}
