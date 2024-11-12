class data {
    // data member atau variabel instant
    public int intpublic;
    private int intprivate;
    private double doubleprivaet;

    // constructor, modifier public
    public data() {
        this.intpublic = 0;
        this.intprivate = 100;
    }

    // getter
    public int getintprivate() {
        return this.intprivate;
    }

    // setter
    public void setdoubleprivate(double value) {
        this.doubleprivaet = value;
    }

    // cetak
    void cetak() {
        System.out.println(this.intpublic);
        System.out.println(this.intprivate);
        System.out.println(this.doubleprivaet);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objec
        data objec = new data();

        // membaca dan menulis menggunakan public
        /// tulis
        objec.intpublic = 5;
        // baca
        System.out.println("public : " + objec.intpublic);

        // membaca atau read menggunakan getter
        int angka = objec.getintprivate();
        System.out.println("getter :" + angka);

        // menulis mnggunakan setter
        objec.setdoubleprivate(0.05);
        objec.cetak();
    }
}
