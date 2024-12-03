package com.tutoral;

class Player {
    // Variabel
    private String nama;

    // constructor
    Player(String nama) {
        this.nama = nama;
    }

    void Cetak() {
        System.out.println("nama : " + this.nama);
    }
}
