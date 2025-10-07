/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author USER
 */
public class kapalClass extends kendaraanClass {
    
    String  mesin;
   

 
    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }
    public void tampil () {
        System.out.println("Nama Merek\t : " + super.merk);   
        System.out.println("Tipe\t : " + super.tipe);
        System.out.println("Tahun Produksi\t : " + super.tahun_produksi);
        System.out.println("Mesin\t : " + this.mesin);
        System.out.println("Harga\t : " + super.harga);
}
}
