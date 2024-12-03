package com.tutoral;

import com.terminal.Console;

class main {
    public static void main(String[] args) {
        // membuat
        Player player1 = new Player("jojo");
        Player player2 = new Player("jaja");
        Player player3 = new Player("jeje");

        player1.Cetak();
        player2.Cetak();
        player3.Cetak();

        Console.log("Hallo");
        Console.log("H");
        Console.log("Hey");
    }
}
