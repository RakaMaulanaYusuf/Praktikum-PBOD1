/*Nama : Raka Maulana Yusuf */
/*NIM : 24060122140119 */
/*Deskripsi : file main Garis */
/*Nama file : MGaris.java */

public class MGaris {

    public static void main(String args[]){

        Titik t1,t2,t3,t4;
        Garis g1,g2,g3;

        t1 = new Titik(8,3);  
        t2 = new Titik(1,0);
        t3 = new Titik(1,5);
        t4 = new Titik(6,3);
        
        

        g1 = new Garis(t1,t2);
        g2 = new Garis(t3, t4);
        g3 = g1.getrefleksiY();

        System.out.println("g1 terdiri dari titik : (" + g1.getTitikAwal().getAbsis() + "," + g1.getTitikAwal().getOrdinat() + ") dan (" + g1.getTitikAkhir().getAbsis() + "," + g1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("g2 terdiri dari titik : (" + g2.getTitikAwal().getAbsis() + "," + g2.getTitikAwal().getOrdinat() + ") dan (" + g2.getTitikAkhir().getAbsis() + "," + g2.getTitikAkhir().getOrdinat() + ")");
        System.out.println("g3 terbuat dari refleksi g1");
        System.out.println("g3 terdiri dari titik : (" + g3.getTitikAwal().getAbsis() + "," + g3.getTitikAwal().getOrdinat() + ") dan (" + g3.getTitikAkhir().getAbsis() + "," + g3.getTitikAkhir().getOrdinat() + ")" ) ;


        System.out.println("Panjang Garis g1 : " + g1.getPanjang());
        System.out.println("Gradien Garis g1 : " + g1.getGradien());
        System.out.println("Panjang Garis g2 : " + g2.getPanjang());
        System.out.println("Gradien Garis g2 : " + g2.getGradien());
        System.out.println("Panjang Garis g3 : " + g3.getPanjang());
        System.out.println("Gradien Garis g3 : " + g3.getGradien());
        System.out.println("Is g1 tegak lurus dengan g3? " + g1.IstegakLurus(g3));
        System.out.println("Is g1 tegak lurus dengan g2? " + g1.IstegakLurus(g2));
        System.out.println("Is g2 tegak lurus dengan g3? " + g2.IstegakLurus(g3));
        


        
    }
    
}


