// membuat class sebagai template
class Mahasiswa {
    // membuat ciri-ciri atau atribut objek
    String nama;
    String NiM;
    String prodi;
    double ipk;
    int umr;

}

public class App {
    public static void main(String[] args) throws Exception {
        // instasi atau membuat objek
        Mahasiswa mhs_1 = new Mahasiswa();
        Mahasiswa mhs_2 = new Mahasiswa();

        // pengisian data ojek
        mhs_1.nama = "jojo";
        mhs_1.NiM = "23241066";
        mhs_1.prodi = "PTI";
        mhs_1.ipk = 4.00;
        mhs_1.umr = 20;

        mhs_2.nama = "dyo";
        mhs_2.NiM = "23241077";
        mhs_2.prodi = "HUKUM";
        mhs_2.ipk = 3.00;
        mhs_2.umr = 21;

        // cetak data
        System.out.println("Nama Mahasiswa : " + mhs_1.nama);
        System.out.println("NIM : " + mhs_1.NiM);
        System.out.println("prodi : " + mhs_1.prodi);
        System.out.println("ipk : " + mhs_1.ipk);
        System.out.println("umur : " + mhs_1.umr);

        System.out.println("Nama Mahasiswa : " + mhs_2.nama);
        System.out.println("NIM : " + mhs_2.NiM);
        System.out.println("prodi : " + mhs_2.prodi);
        System.out.println("ipk : " + mhs_2.ipk);
        System.out.println("umur : " + mhs_2.umr);
    }
}
