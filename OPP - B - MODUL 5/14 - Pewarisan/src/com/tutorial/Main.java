package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "jojo";
        hero1.cetak();

        // membuuat objek dari subclass
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "jeje";

        hero2.cetak();

        //
        HeroIntel Hero3 = new HeroIntel();
        Hero3.name = "juju";

        Hero3.cetak();

    }
}
