// Nama     : Raka Maulana Yusuf
// NIM      : 24060122140119
// Tanggal  : 4 Mei 2024

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum7wajib;

/**
 *
 * @author RakaMaulanaYusuf
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47. menembak(5);

        System.out.println("===========================");

        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }
}
