package com.tutorial;

    // Kelas Segitiga
public class Segitiga extends BangunDatar {
    public float alas;
    public float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return 0.5f * alas * tinggi;
    }

    public float keliling() {
        // Asumsi segitiga sama sisi
        return 3 * alas;
    }
}

