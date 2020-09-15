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
public class HargaKeramikTermurah {
    /*Data Keramik*/
    float luas;
    float panjang;
    float lebar;
    float isi;
    float harga;
    
    /*Mencari Harga Termurah*/
    void hitungLuasKeramik(){
        float LuasKeramik;
        LuasKeramik = this.panjang * this.lebar * this.isi;
        System.out.println("Luas Keramik perbox adalah " + LuasKeramik + "cm2");
    }
    
    void hitungBahan(){
        float bahan;
        bahan = this.luas / (this.panjang * this.lebar * this.isi);
        System.out.println("Bahan yang dibutuhkan adalah " + Math.ceil(bahan) + " box");
    }
    
    void hargaKebutuhan(){
        float hargaTotal;
        hargaTotal = (this.luas / (this.panjang * this.lebar * this.isi)) * this.harga;
        System.out.println("Biaya untuk memasang keramik adalah " + hargaTotal);
    }
}
