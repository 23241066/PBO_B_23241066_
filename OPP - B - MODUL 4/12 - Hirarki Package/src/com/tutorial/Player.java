package com.tutorial;

import com.Terminal.Console;

// visbiliti default hanya bisa di akses oleh package yang sama
class Player {
    // variabel objek
    private String nama;

    // comstructor
    Player(String nama) {

    }

    // method Cetak
    void Cetak() {
        System.out.println("Nama : " + nama);

        Console.log("menggunaan Console");
        Console.log("nama : " + this.nama);
    }

    // membuat getter
    String getnama(){
        return this.nama;
    }
}
