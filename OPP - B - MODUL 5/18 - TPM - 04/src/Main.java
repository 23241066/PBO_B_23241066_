// Kelas abstrak BangunDatar
abstract class BangunDatar {
    // Metode abstrak
    public abstract float luas();
    public abstract float keliling();
}

// Kelas Persegi
class Persegi extends BangunDatar {
    public float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

// Kelas PersegiPanjang
class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

// Kelas Segitiga
class Segitiga extends BangunDatar {
    public float alas;
    public float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float keliling() {
        // Asumsi segitiga sama sisi
        return 3 * alas;
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari setiap kelas
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(7);
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        Segitiga segitiga = new Segitiga(6, 4);

        // Menampilkan hasil perhitungan
        System.out.println("Persegi: Luas = " + persegi.luas() + ", Keliling = " + persegi.keliling());
        System.out.println("Lingkaran: Luas = " + lingkaran.luas() + ", Keliling = " + lingkaran.keliling());
        System.out.println("Persegi Panjang: Luas = " + persegiPanjang.luas() + ", Keliling = " + persegiPanjang.keliling());
        System.out.println("Segitiga: Luas = " + segitiga.luas() + ", Keliling = " + segitiga.keliling());
    }
}