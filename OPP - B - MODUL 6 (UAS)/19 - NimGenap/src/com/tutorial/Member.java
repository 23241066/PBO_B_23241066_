package com.tutorial;

// Subclass Member
class Member extends Niaga {
    private final double DISKON_10 = 0.10;
    private final double DISKON_5 = 0.05;
    private final double DISKON_3 = 0.03;

    public Member(String nama, double totalBelanja) {
        super(nama, totalBelanja);
    }

    @Override
    public void tampilkanDetailBelanja() {
        double diskonPersen = 0.0;
        if (totalBelanja > 500000) {
            diskonPersen = DISKON_10;
        } else if (totalBelanja >= 100000 && totalBelanja <= 499999) {
            diskonPersen = DISKON_5;
        } else if (totalBelanja < 100000) {
            diskonPersen = DISKON_3;
        }

        double diskonRupiah = totalBelanja * diskonPersen;
        double totalSetelahDiskon = totalBelanja - diskonRupiah;

        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Kartu Member: Ya");
        System.out.println("Total Belanja Sebelum Diskon: Rp " + totalBelanja);
        System.out.println("Diskon: " + (diskonPersen * 100) + "%");
        System.out.println("Diskon (Dalam Rupiah): Rp " + diskonRupiah);
        System.out.println("Total Belanja Setelah Diskon: Rp " + totalSetelahDiskon);
    }
}