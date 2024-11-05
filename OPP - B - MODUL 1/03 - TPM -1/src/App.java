 import java.util.Scanner;

class Kalkulator {
    // Atribut untuk menyimpan dua angka 
    double angka1;
    double angka2;

    // Konstruktor Kalkulator
    Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    // Method untuk penjumlahan
    double penjumlahan() {
        return angka1 + angka2;
    }

    // Method untuk pengurangan
    double pengurangan() {
        return angka1 - angka2;
    }

    // Method untuk perkalian
    double perkalian() {
        return angka1 * angka2;
    }

    // Method untuk pembagian
    double pembagian() {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return Double.NaN; // return NaN jika terjadi pembagian dengan nol
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                lanjut = false;
                System.out.println("Terima kasih! Program selesai.");
                continue;
            }

            // Meminta input angka dari pengguna
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            // Membuat objek Kalkulator dengan konstruktor
            Kalkulator kalkulator = new Kalkulator(angka1, angka2);

            double hasil;
            switch (pilihan) {
                case 1:
                    hasil = kalkulator.penjumlahan();
                    System.out.println("Hasil penjumlahan: " + hasil);
                    break;
                case 2:
                    hasil = kalkulator.pengurangan();
                    System.out.println("Hasil pengurangan: " + hasil);
                    break;
                case 3:
                    hasil = kalkulator.perkalian();
                    System.out.println("Hasil perkalian: " + hasil);
                    break;
                case 4:
                    hasil = kalkulator.pembagian();
                    if (!Double.isNaN(hasil)) { // hanya cetak jika bukan NaN
                        System.out.println("Hasil pembagian: " + hasil);
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
