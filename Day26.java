import java.util.Scanner;
public class day26 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        // BIODATA MAHASISWA
        System.out.print("masukkan Nama: ");
        String Nama = caca.nextLine();

        System.out.print("masukkan NIM: ");
        String NIM = caca.nextLine();

        System.out.print("masukkan Kelas: ");
        char Kelas = caca.next().charAt(0);

        System.out.print("masukkan Umur: ");
        int Umur = caca.nextInt();

        caca.nextLine();

        System.out.print("masukkan Prodi: ");
        String Prodi = caca.nextLine();
        
        System.out.print("masukkan IPK: ");
        double IPK = caca.nextDouble();
        
        System.out.print("Status Aktif: ");
        Boolean StatusAktif = caca.nextBoolean(); 

        System.out.println(" === BIODATA MAHASISWA === ");

        System.out.println("Nama\t\t: "+Nama);
        System.out.println("NIM\t\t: "+NIM);
        System.out.println("Kelas\t\t: "+Kelas);
        System.out.println("Umur\t\t: "+Umur+ " Tahun");
        System.out.println("Prodi\t\t: "+Prodi);
        System.out.printf("IPK\t\t: %.2f%n" , IPK);
        System.out.println("Status Aktif\t: "+StatusAktif);

        //MENGHITUNG LUAS LINGKARAN
        final double PI = 3.14;
        double jarijari;
        double luas; 

        System.out.print("Masukkan jarijari: ");
        jarijari = caca.nextDouble();

        luas = PI * jarijari * jarijari;

        System.out.println("Luas lingkaran: "+ luas);
        

        //MENUKAR NILAI DUA VARIABEL
            int a , b;

            System.out.print("masukkan nilai a: ");
            a = caca.nextInt();

            System.out.print("masukkan nilai b: ");
            b = caca.nextInt();

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("nilai a setelah ditukar: "+ a);
            System.out.println("nilai b setelah dituar: "+ b);
     }
}
