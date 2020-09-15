/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg1;

/**
 *
 * @author Wildan Mu'tashim
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HargaKeramikTermurah A = new HargaKeramikTermurah();
        A.harga = 54000;
        A.panjang = 30;
        A.lebar = 30;
        A.isi = 10;
        A.luas = 1000000;
        A.hitungLuasKeramik();
        A.hitungBahan();
        A.hargaKebutuhan();
        
        HargaKeramikTermurah B = new HargaKeramikTermurah();
        B.harga = 65000;
        B.panjang = 40;
        B.lebar = 40;
        B.isi = 5;
        B.luas = 1000000;
        B.hitungLuasKeramik();
        B.hitungBahan();
        B.hargaKebutuhan();
        
        HargaKeramikTermurah C = new HargaKeramikTermurah();
        C.harga = 60000;
        C.panjang = 40;
        C.lebar = 30;
        C.isi = 8;
        C.luas = 1000000;
        C.hitungLuasKeramik();
        C.hitungBahan();
        C.hargaKebutuhan();
    }
    
}
