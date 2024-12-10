package com.tutorial;

public class HeroTank extends Hero{

    // atribut baru
    String nama = "Class Hiro Tank";
    public int defencePower;

    // Overreding method
    void cetak(){
        System.out.println("Ini adalah " + this.nama);
        this.dummyMethod();
    }
    
}
