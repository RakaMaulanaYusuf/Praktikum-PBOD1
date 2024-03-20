// Nama : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : MBujurSangkar.java

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar hs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+ " satuan adalah " +hs.hitungLuas(sisi));
        scan.close(); // Close the Scanner object
    }
}
// apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 
// Jawaban : Pada kasus ini karena class BujurSangkar itu kelas turunannya class abstrak Bangun datar maka class BujurSangkar harus mengimplementasikan metode abstrak yang ada pada class BangunDatar agar tidak terjadi eror