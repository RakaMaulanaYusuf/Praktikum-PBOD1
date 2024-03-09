// Nama : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : AngkaSial.java

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println("Angka "+angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Pada program di atas, ketika eksepsi `AngkaSialException` terjadi pada pemanggilan `angkasial.cobaAngka(13);`, baris 6 (`System.out.println("Angka "+angka+" bukan angka sial");`) tidak akan dieksekusi. 
// program akan langsung melompat ke blok `catch` . Jadi, pada kasus ini, baris 9 tidak akan dieksekusi karena eksepsi terjadi sebelumnya dan program langsung melanjutkan ke blok `catch`.
// Pada program diatas baris 19 dieksekusi karena terdapat angka 13.