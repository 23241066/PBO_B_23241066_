package com.tutorial;

// Superclass Niaga
class Niaga {
    protected String nama;
    protected double totalBelanja;

    public Niaga(String nama, double totalBelanja) {
        this.nama = nama;
        this.totalBelanja = totalBelanja;
    }

    public void tampilkanDetailBelanja() {
        // Implementasi di subclass
    }
}