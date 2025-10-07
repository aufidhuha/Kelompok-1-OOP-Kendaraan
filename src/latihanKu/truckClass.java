/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class truckClass extends kendaraanClass {

    String  warna, mesin;
  
    public void setWarna(String WarnaC) {
        this.warna = WarnaC;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setmesin(String mesinC) {
        this.mesin = mesinC;
    }

    public String getmesin() {
        return this.mesin;
    }

    public void tampil() {
            System.out.println("Nama Merek\t : " +super.merk);
            System.out.println("Tipe\t : " +super.tipe);
            System.out.println("Warna\t : " +this.warna);
            System.out.println("Mesin\t : " +this.mesin);
            System.out.println("Tahun produksi\t : " +super.tahun_produksi);
            System.out.println("Harga\t :" +super.harga);
        
    }
}
