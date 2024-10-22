class Mahasiswa {
    // Data member cyry
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void cetak() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);

    }

    // method tanpa return dan dengan parameter
    void setnama(String nama) {
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getnama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHY(String pesan) {
        return "Halo : " + this.nama + pesan;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs_1 = new Mahasiswa("jojo", "23241066");

        // memanggil method tanpa return dan tanpa parameter
        mhs_1.cetak();

        // memanggil method tanpa return dan dengan parameter
        mhs_1.setnama("jojy");
        mhs_1.cetak();

        // memanggil method dengan return dan tanpa parameter
        System.out.println();
        mhs_1.getnama();
        System.out.println();
        mhs_1.getNIM();

        // memanggil method dengan return dan dengan parameter
        String pesan = mhs_1.sayHY("Semangat belajar OOP");
        System.out.println(pesan);
    }
}
