class HitungGajiBersih {
    // data member
    private int gaji_pokok;
    private int Tunjangan;
    private double pajak;

    // contructor
    public HitungGajiBersih() {
        this.gaji_pokok = 10000;
        this.Tunjangan = 5000;
        this.pajak = 10.5;
    }

    // sett gaji_pokok
    public void setgaji_pokok(int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    // gett gaji_pokok
    public int getGajiPokok() {
        return gaji_pokok;
    }

    // sett tunjangan
    public void setTunjangan(int Tunjangan) {
        this.Tunjangan = Tunjangan;
    }

    // gett tunjangan
    public int getTunjangan() {
        return Tunjangan;
    }

    // sett pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // gett pajak
    public double getPajak(int pajak) {
        return pajak;
    }

    // metode mencetak gaji bersih
    public void CetakGajiBersih() {
        double nilaiPajak = gaji_pokok * (pajak / 100);
        double gajiBersih = gaji_pokok + Tunjangan - nilaiPajak;

        System.out.println("gajiBersih :" + gajiBersih);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        HitungGajiBersih gBersih = new HitungGajiBersih();

        // cetak GajiBersih
        gBersih.CetakGajiBersih();
    }
}
