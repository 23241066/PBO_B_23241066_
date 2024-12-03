package com.tutorial;

import com.Terminal.Console;

import static com.Terminal.Console.log;

class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("jojo");
        player1.Cetak();

        Console.log("Menampilkan data dari Console");
        Console.log("player name " + player1.getnama());

        log("Mrnggunakan static method log");
        log(player1.getnama());
    }
}
