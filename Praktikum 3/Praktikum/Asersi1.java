// NAMA : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : Asersi1.java
public class Asersi1{
    public static void main(String[] args){
        int x = -1;
        if(x>0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x<0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}