class Player {
    // data member atau Variabel instan
    String nama; // ddefault, bisa di akses dari luar class

    public int exp; // public, bisa di accses dari luar class
    private int health; // private, tidak bisa di accses dari luar class

    // konstruktor, tanpa modifier acces
    Player(String nama, int exp, int health) {
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
    // method, default modifier accses
    void cetak(){
        kurangexp();
        System.out.println("player : " + this.nama);
        System.out.println("exp : " + this.exp);
        System.out.println("helath : " + this.health);
    }
    // method, public modifier accses
    public void ubahhealth(int healthBaru){
        this.health = healthBaru;
    }
    // method, private modifier accses
    private void kurangexp(){
        this.exp -= 1; // exp = exp - 1
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Player player1 = new Player("jojo", 50, 100);

        // default
        // membaca data
        System.out.println(player1.nama);
        // menulis data
        player1.nama = "conan";
        System.out.println(player1.nama);

        // public
        // membaca data
        System.out.println(player1.exp);
        // menulis data
        player1.exp = 75;
        System.out.println(player1.exp);

        // // private 
        // // membaca data
        // System.out.println(player1.health);
        // // menuli data
        // player1.health = 120;
        // System.out.println()player1.helath;

        // method default
        player1.cetak();

        // method public
        player1.ubahhealth(130); // method tulis
        player1.cetak();

        // // method private 
        // player1.kurangexp();
        player1.cetak();

    }
}
