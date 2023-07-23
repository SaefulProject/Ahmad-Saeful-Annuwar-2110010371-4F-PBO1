/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas;

/**
 *
 * @author Ikuyaa
 */
public class MobilLengkap {
    String warna;
    int tahunproduksi;
    String hidupkanmobil;
    String matikanmobil;
    int ubahgigi;
    
    void isiVariabel (String warnamobil, int tahunmobil, 
            String hidupkan_mobil, String matikan_mobil, int ubah_gigi){
        warna=warnamobil;
        tahunproduksi = tahunmobil;
        hidupkanmobil = hidupkan_mobil;
        matikanmobil = matikan_mobil;
        ubahgigi = ubah_gigi;
    }
    
    void printmobil(){
        System.out.println("Warna Mobil : "+ warna);
        System.out.println("Tahun Mobil : "+ tahunproduksi);
        System.out.println("Hidupkan Mobil : "+ matikanmobil);
        System.out.println("Gigi : "+ ubahgigi);
    }
}
