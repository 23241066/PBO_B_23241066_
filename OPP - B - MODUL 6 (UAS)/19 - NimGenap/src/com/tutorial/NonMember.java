package com.tutorial;

// Subclass NonMember
class NonMember extends Niaga {
    private final double DISKON_3 = 0.03;

    public NonMember(String nama, double totalBelanja) {
        super(nama, totalBelanja);
    }

    @Override
    public void tampilkanDetailBelanja() {
        double diskonPersen = 0.0;
        if (totalBelanja > 100000) {
            diskonPersen = DISKON_3;
        }

        double diskonRupiah = totalBelanja * diskonPersen;
        double totalSetelahDiskon = totalBelanja - diskonRupiah;

        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Kartu Member: Tidak");
        System.out.println("Total Belanja Sebelum Diskon: Rp " + totalBelanja);
        System.out.println("Diskon: " + (diskonPersen * 100) + "%");
        System.out.println("Diskon (Dalam Rupiah): Rp " + diskonRupiah);
        System.out.println("Total Belanja Setelah Diskon: Rp " + totalSetelahDiskon);
    }
}