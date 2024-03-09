// Nama : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : Asersi2.java

// class lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

// class asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 7;
        assert(jariJari>0): "jari-jari harus lebih besar dari nol!!!";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

// Secara konsep program diatas sudah baik dalam penggunaan asersi untuk memeriksa bahwa jari-jari pada lingkaran itu harus lebih besar dari 0 
// sebelum menghitung kelilingnya.
// Mengubah pesan asersi nya sesuai perintah atau kondisi assertnya
