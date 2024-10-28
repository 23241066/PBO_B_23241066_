class PersegiPanjang {
    // Atribut untuk panjang dan lebar
    private double panjang;
    private double lebar;

    // Konstruktor untuk menginisialisasi panjang dan lebar
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Setter untuk mengubah panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Setter untuk mengubah lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    // Method untuk mencetak hasil
    public void cetakHasil() {
        System.out.println("Panjang: " + this.panjang);
        System.out.println("Lebar: " + this.lebar);
        System.out.println("Luas: " + this.hitungLuas());
        System.out.println("Keliling: " + this.hitungKeliling());
    }

    public static void main(String[] args) {
        // Membuat objek PersegiPanjang dengan panjang 5 dan lebar 3
        PersegiPanjang pp = new PersegiPanjang(6, 2);
        pp.cetakHasil();

        // Mengubah panjang dan lebar
        pp.setPanjang(10);
        pp.setLebar(4);
        pp.cetakHasil();
    }
}
