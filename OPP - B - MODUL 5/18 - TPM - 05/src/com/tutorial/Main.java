package com.tutorial;


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