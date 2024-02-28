/*Nama : Raka Maulana Yusuf */
/*NIM : 24060122140119 */
/*Deskripsi : file main Titik */
/*Nama file : MTitik.java */


public class MTitik {

    public static void main(String args[]){
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik();

        t1.setAbsis(2);
        t1.setOrdinat(4);
        t2.setAbsis(5);
        t2.setOrdinat(6);
        t3.setAbsis(6);
        t3.setOrdinat(7);
        t1.refleksiX();

        System.out.println("Jumlah Objek Titik : " + Titik.getcounterTitik());
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
        System.out.println("Jarak t1 ke t2 : " + t1.getJarak(t2));
        System.out.println("Jarak t1 ke t3 : " + t1.getJarak(t3));
        System.out.println("Jarak t2 ke t3 : " + t2.getJarak(t3));
        System.out.println("Jarak t1 ke pusat : " + t1.getJarakPusat());
        System.out.println("Jarak t2 ke pusat : " + t2.getJarakPusat());
        System.out.println("Jarak t3 ke pusat : " + t3.getJarakPusat());



    }
    
}
