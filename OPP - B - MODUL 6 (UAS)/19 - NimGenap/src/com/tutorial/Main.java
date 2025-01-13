package com.tutorial;

// Main Class
public class Main {
    public static void main(String[] args) {
        Niaga pelanggan1 = new Member("Chelly", 600000);
        pelanggan1.tampilkanDetailBelanja();

        System.out.println(); // Pemisah output

        Niaga pelanggan2 = new NonMember("Budi", 120000);
        pelanggan2.tampilkanDetailBelanja();

        System.out.println(); // Pemisah output

        Niaga pelanggan3 = new Member("Bima", 80000);
        pelanggan3.tampilkanDetailBelanja();
    }
}