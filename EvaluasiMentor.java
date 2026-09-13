/* soal 1
public class evaluasi {
    public static void main(String[] args) {

        System.out.print(" Nama = caca\n NIM = D0226010\n Kelas = A\n Mahasiswa = true");
    }
}
*\ 

/* soal 2
  public class evaluasi2 {
      public static void main(String[] args) {
        
        double a = 2.5666;
        System.out.printf("%.2f ", a);

        double b = 3.1455;
        System.out.printf("%.2f ", b);
    }
    
}
*\ 

/* soal 3 
public class soal3 {
    public static void main(String[] args) {
        String nama;
        int umur;



        nama = "altaf";
        umur = 17;

        System.out.println("Sebelum diubah: "+ nama);
        System.out.println("Sebelum diubah: "+ umur);
        
        nama = "caca";
        umur = 18;

        System.out.println("Sesudah diubah: "+ nama);
        System.out.println("Sesudah diubah: "+ umur);

    }
}
*\

/* soal 4
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
*\

/* soal 5
public class soallima {
    public static void main(String[] args) {
        
        String nama = "caca";
        System.out.println(nama);

        byte umur = 18;
        System.out.println(umur);

        int Hargabuku = 12000;
        System.out.println(Hargabuku);

        short Jumlahbunga = 200;
        System.out.println(Jumlahbunga);

        float suhu = 90.6f;
        System.out.println(suhu);

        double luas = 18.6;
        System.out.println(luas);

        char kelas = 'A';
        System.out.println(kelas);

        long Jumlahpenduduk = 24500000L;
        System.out.println(Jumlahpenduduk);

        boolean Sudahmandi = true;
        System.out.println(Jumlahpenduduk);
    }
}
*\
