// Nama : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : MPoligon.java

package org.main;

import org.bangundatar.*;

public class MPoligon{
    
    public static void main(String[] args){
        PersegiPanjang persegipanjang = new PersegiPanjang(15, 10, 4);
        persegipanjang.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegipanjang.hitungLuas());

        Segitiga triangle = new Segitiga(15, 25, 3);
        triangle.printinfo();
        System.out.println("Luas Segitiga :"+triangle.hitungLuas());
    }
}