// Nama : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : M;ingkaran.java

package main;
import BangunDatar.Lingkaran;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scaner digunakan untuk input jejari
        System.out.print("Masukkan jejari: ");
        double jejari = scan.nextDouble(); // Membaca input dari pengguna untuk jejari lingkaran atau jejari di isi dengan input dari pengguna
        Lingkaran l = new Lingkaran(jejari); // Membuat objek lingkaran dengan jejari yang di input
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close(); // Untuk menutup scaner
    }
}