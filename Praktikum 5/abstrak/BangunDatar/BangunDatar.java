// Nama : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : BangunDatar.java

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}