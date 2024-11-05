//class polos tanpa constructor
class Polos {
    // atribut objec
    String dataString;
    int dataInterger;
}

// membuat dengan onstructor
class Mahasiswa {
    // atribut
    String nama;
    String prodi;
    String nim;

    // costructor
    // tidak memiliki return value/ nilai balik
    // method yang pertama kali dipanggil saat objec pertamakali
    Mahasiswa(String inputNama, String inputnim, String inputprodi) {
        // mengisi data
        nama = inputNama;
        nim = inputnim;
        prodi = inputprodi;

        // menyetak data
        System.out.println("nama mahasiswa " + nama);
        System.out.println("nim mahasiswa " + nim);
        System.out.println("prodi mahasiswa " + prodi);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // pembuatan objek atau instansiasi objek
        Polos polos_1 = new Polos();

        // isi atribut
        polos_1.dataString = "polos";
        polos_1.dataInterger = 10;

        // cetak objek
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataString);

        // pembuatan objec mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("jojo", "23241066", "PTI");
        Mahasiswa mhs_2 = new Mahasiswa("jolyn", "23241077", "PTY");
        Mahasiswa mhs_3 = new Mahasiswa("jony", "23241055", "PTP");
    }
}
