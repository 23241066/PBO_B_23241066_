class HitungGajiBersih {
    // data member
    private int gaji_pokok;
    private int Tunjangan;
    private double pajak;

    // contructor
    public HitungGajiBersih() {
        this.gaji_pokok = 0;
        this.Tunjangan = 0;
        this.pajak = 0.0;
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
    public double getPajak() {
        double totalPendapatan = gaji_pokok + Tunjangan;
        return pajak = totalPendapatan * (pajak / 100);
    }

    // metode mencetak gaji bersih
    public void CetakGajiBersih() {
        double gajiBersih = gaji_pokok + Tunjangan - getPajak();

        System.out.println("gajiBersih :" + gajiBersih);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        HitungGajiBersih gBersih = new HitungGajiBersih();

        gBersih.setgaji_pokok(15000);
        gBersih.setTunjangan(5000);
        gBersih.setPajak(2);

        // cetak GajiBersih
        gBersih.CetakGajiBersih();
    }
}
