/*Nama      : Raka Maulana Yusuf */
/*NIM       : 24060122140119 */
/*Tanggal   : 12 Mei 2024 */

class Kupu {
    void gerak() {
    }
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("Ulat Merayap");
    }
}

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}

public class Main {
    public static void main(String[] args) {
        /*Kamus Lokal */
        Ulat K;
        Data<Kupu> anu;

        /*Algoritma */
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}