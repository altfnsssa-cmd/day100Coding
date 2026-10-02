public class day31 {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = caca.nextBoolean();

        System.out.print("Apakah memiliki kartu anggota? (true/false): ");
        boolean kartuAnggota = caca.nextBoolean();

        System.out.print("Apakah sedang terkena sanksi? (true/false): ");
        boolean terkenaSanksi = caca.nextBoolean();

        System.out.print("Apakah memiliki status khusus? (true/false): ");
        boolean statusKhusus = caca.nextBoolean();

        boolean hasil = (mahasiswa && kartuAnggota && !terkenaSanksi) || statusKhusus;

        System.out.println("hasil: " + hasil);
    }
}
