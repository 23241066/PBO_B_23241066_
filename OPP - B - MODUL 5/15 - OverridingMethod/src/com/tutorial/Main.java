package com.tutorial;

public class Main {
    public static void main(String[] args) {

        //
        Hero hero1 = new Hero();
        hero1.name = "jojo";
        hero1.cetak();

        // Membuat objek dari subclass

        HeroTank hero2 = new HeroTank();
        hero2.name = "Atlas";
        hero2.defencePower = 3000;
        hero2.cetak();
    }

}
